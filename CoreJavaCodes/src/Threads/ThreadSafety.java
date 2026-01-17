package Threads;
/*Thread-safe means the result remains correct even when multiple threads access shared data.
  We use synchronized to make sure only one thread updates the data at a time.*/

public class ThreadSafety
{
    int value = 0;

	    // synchronized → only ONE thread can run this method at a time
	    public synchronized void increase() 
	    {
	        value = value + 1;   // safely increment the shared value
	    }
	    public static void main(String[] args) 
	    {
	    	ThreadSafety c = new ThreadSafety();  // shared object

	        // Thread 1 work
	        Runnable r1 = new Runnable()
	        {
	            public void run() 
	            {
	                c.increase();   // increase shared value safely
	                System.out.println("Thread-1 increased value to " + c.value);
	            }
	        };

	        // Thread 2 work
	        Runnable r2 = new Runnable() 
	        {
	            public void run() 
	            {
	                c.increase();   // increase shared value safely
	                System.out.println("Thread-2 increased value to " + c.value);
	            }
	        };

	        // Create thread objects
	        Thread t1 = new Thread(r1);
	        Thread t2 = new Thread(r2);

	        // Start both threads
	        t1.start();
	        t2.start();
	    }
	}

