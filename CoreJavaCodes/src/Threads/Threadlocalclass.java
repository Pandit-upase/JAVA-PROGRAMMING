package Threads;
//ThreadLocal gives every thread its own separate value.”

public class Threadlocalclass 
{    
	// Each thread gets its own value here
	    static ThreadLocal<String> tl = new ThreadLocal<>();

	    public static void main(String[] args) 
	    {
	        Thread t1 = new Thread() 
	        {
	            public void run() 
	            {
	                tl.set("Pandit");   // value for Thread-1
	                System.out.println("Thread-1: " + tl.get());
	            }
	        };

	        Thread t2 = new Thread()
	        {
	            public void run()
	            {
	                tl.set("Ram");      // value for Thread-2
	                System.out.println("Thread-2: " + tl.get());
	            }
	        };

	        t1.start();
	        t2.start();
	    }
}
