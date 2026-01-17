package Threads;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
/*>Has call() method
 >Returns a value
 >Can throw checked exceptions
 >Used when you want a result from thread*/
public class CallableDemo 
{
	    public static void main(String[] args) throws Exception 
	    {
	    	// Create a Callable (returns a value)
	    	Callable<String> task = new Callable<String>() 
	    	{
	            public String call() throws Exception 
	            {
	                return "Hello from Callable";
	            }
	        };

	        // Wrap Callable inside FutureTask
	        FutureTask<String> ft = new FutureTask<>(task);

	        // Run FutureTask using a Thread
	        Thread t = new Thread(ft);
	        t.start();

	        // Get the result
	        System.out.println(ft.get());
	    }
	}