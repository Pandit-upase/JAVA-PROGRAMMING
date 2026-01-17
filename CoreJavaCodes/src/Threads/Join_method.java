package Threads;
//join() makes one thread wait until another thread finishes.
//join() throws InterruptedException because the waiting thread can be interrupted while
//it is waiting for another thread to finish.

public class Join_method extends Thread 
{
	    public void run() 
	    {
	        System.out.println("Child thread running");
	    }

	    public static void main(String[] args) throws Exception 
	    {
	    	Join_method t = new Join_method();
	        t.start();

	        t.join();  // main thread waits for t to finish
	        System.out.println("Main thread continues after join()");
	    }
	}

