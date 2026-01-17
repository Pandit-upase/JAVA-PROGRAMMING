package Threads;
//run() contains the actual code we want to run in code.
public class run_method extends Thread
{
	
	    public void run() 
	    {  
	        System.out.println("run() method: Thread is running");
	    }
	    public static void main(String[] args)
	    {
	    	run_method t = new run_method();
	        t.start();   // JVM calls run() internally in new thread
	    }
	}


