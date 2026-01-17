package Threads;
/* Thread scheduler decides which tread to run for how long,it picks thread from runnable to running
 * then thread scheduler picks the threads for(Sleep,wait,blocked)and then gives backto runnable,
 * it doesn't maintain output order */
public class Thread_Scheduler extends Thread
{
	    public void run() 
	    {
	        // This loop runs fast, and scheduler decides which thread gets CPU
	        for(int i = 1; i <= 5; i++) 
	        {
	            System.out.println(Thread.currentThread().getName() + " → " + i);
	        }
	 }

	    public static void main(String[] args)
	    {
	        // Creating 3 threads
	    	Thread_Scheduler t1 = new Thread_Scheduler();
	    	Thread_Scheduler t2 = new Thread_Scheduler();
	    	Thread_Scheduler t3 = new Thread_Scheduler();

	        // Giving names to threads (optional but helps to see output)
	        t1.setName("Thread-1");
	        t2.setName("Thread-2");
	       t3.setName("Thread-3");

	        // RUNNABLE → scheduler decides who runs first
	        t1.start();
	        t2.start();
	        t3.start();

	        // Output order will always be mixed because scheduler controls execution
	    }
}

