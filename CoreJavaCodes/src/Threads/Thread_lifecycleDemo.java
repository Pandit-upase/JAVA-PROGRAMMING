package Threads;
/* New – Thread object is created.
Runnable – start() is called; thread is ready to run.
Running – Thread scheduler picks it and executes run().
Waiting / Timed Waiting – Thread temporarily pauses (sleep, wait, join).
Terminated – run() method finishes and thread ends.*/

public class Thread_lifecycleDemo extends Thread
{
	    public void run()
	    {
	        // Running State
	        System.out.println("Inside run(): Thread is RUNNING");
	        System.out.println("Running in: " + Thread.currentThread().getName());
	    }
	
	    public static void main(String[] args) 
	    {
	        // NEW State
	    	Thread_lifecycleDemo t = new Thread_lifecycleDemo();
	        System.out.println("After object creation: " + t.getState());   // NEW
	        System.out.println("hi");
	        
	        // RUNNABLE State
	        t.start();//start()->creates a new thread and the JVM internally calls
	        //run() inside that new thread.
	        
	        //t.run();-->Calling run() directly does not start a new thread; it executes like 
	        //a normal method inside the main thread.
	        
	       // System.out.println("After start(): " + t.getState());           // RUNNABLE

	        // TERMINATED State (run() is very small so it finishes fast)
	        //System.out.println("Final State: " + t.getState());             // TERMINATED or RUNNABLE (depends on timing)
	    }
}

