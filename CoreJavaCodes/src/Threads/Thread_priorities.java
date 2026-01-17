package Threads;

public class Thread_priorities extends Thread
{
	    public void run() 
	    {
	        // Print thread name + its priority
	        System.out.println(Thread.currentThread().getName() 
	                           + " is running with priority: " 
	                           + Thread.currentThread().getPriority());
	    }

	    public static void main(String[] args)
	    {
	        // Creating 3 threads
	    	Thread_priorities t1 = new Thread_priorities();
	    	Thread_priorities t2 = new Thread_priorities();
	    	Thread_priorities t3 = new Thread_priorities();

	        // Setting custom names
	        t1.setName("LOW-PRIORITY Thread");
	        t2.setName("NORMAL-PRIORITY Thread");
	        t3.setName("HIGH-PRIORITY Thread");

	        // setPriority(): sets thread priority (1 to 10)
	        t1.setPriority(1);   // Lowest priority
	        t2.setPriority(5);   // Default (Normal) priority
	        t3.setPriority(10);  // Highest priority

	        // Printing before starting (just for confirmation)
	        System.out.println(t1.getName() + " has priority: " + t1.getPriority());
	        System.out.println(t2.getName() + " has priority: " + t2.getPriority());
	        System.out.println(t3.getName() + " has priority: " + t3.getPriority());

	        // start(): each thread starts and scheduler decides order
	        t1.start();
	        t2.start();
	        t3.start();

	        // Output order is NOT guaranteed (scheduler decides)
	    }
	}
