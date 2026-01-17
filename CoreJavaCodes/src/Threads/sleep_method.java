package Threads;
//sleep() pauses the thread for a given time (in milliseconds).
public class sleep_method extends Thread
{
	    public void run() 
	    {
	        System.out.println("Thread going to sleep...");
	        try 
	        {
	            Thread.sleep(1000);  // sleep for 1 second
	        } catch (Exception e) 
	        {
	        	
	        }
	        System.out.println("Thread woke up!");
	    }

	    public static void main(String[] args) 
	    {
	        new sleep_method().start();
	        
	        //sleep_method sm = new sleep_method();
	        //sm.start();
	        
	    }
	}

