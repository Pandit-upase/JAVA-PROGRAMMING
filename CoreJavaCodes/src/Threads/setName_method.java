package Threads;

public class setName_method extends Thread
{
	    public void run() 
	    {
	        System.out.println("Running: " + Thread.currentThread().getName());
	    }
	

	    public static void main(String[] args)
	    {
	    	setName_method t = new setName_method();
	        t.setName("Worker-1");   // setting name
	        t.start();
	    }
}

