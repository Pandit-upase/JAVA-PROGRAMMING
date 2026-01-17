package Threads;

public class Synchronization_main
{
	 public static void main(String[] args)
	    {
		 Synchronization_demo data = new Synchronization_demo();

	        // Thread 1 work
	        Runnable task1 = new Runnable()
	        {
	            public void run()
	            {
	                for(int i = 1; i <= 10000; i++)
	                {
	                    data.changeValue();
	                }
	            }
	        };

	        // Thread 2 work
	        Runnable task2 = new Runnable()
	        {
	            public void run()
	            {
	                for(int i = 1; i <= 10000; i++)
	                {
	                    data.changeValue();
	                }
	            }
	        };

	        Thread t1 = new Thread(task1);
	        Thread t2 = new Thread(task2);

	        t1.start();
	        t2.start();

	        try
	        {
	            t1.join();
	            t2.join();
	        }
	        catch(Exception e) {}

	        // This will ALWAYS print 20000 (no race condition)
	        System.out.println("Final Value = " + data.value);
	    }
	}

