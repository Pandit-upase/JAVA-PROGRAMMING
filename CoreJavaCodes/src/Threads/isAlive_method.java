package Threads;
//isAlive() checks if the thread is still running.
public class isAlive_method extends Thread
{
	    public void run() 
	    {
	        System.out.println("Thread running...");
	    }

	    public static void main(String[] args) 
	    {
	    	isAlive_method t = new isAlive_method();

	        System.out.println(t.isAlive());  // false (not started)

	        t.start();

	        System.out.println(t.isAlive());  // true (running or just finished)
	    }
	}    
