package Threads;
//Start()->start's a new thread,internally it calls the run() method,but in new seprate thread.
public class Start_method extends Thread
{
	public void run() 
	   {
	        // Code inside run() runs in the new thread
	        System.out.println("Thread is running...");
	    }
	
	    public static void main(String[] args) 
	    {

	    	Start_method t = new Start_method();  // Thread object created (NEW state)

	        t.start();  // start(): creates a new thread and calls run() internally

	        System.out.println("Main thread finished");
	    }
	}


