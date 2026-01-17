package Threads;
import java.util.concurrent.*;
//FutureTask is a class that is both Runnable and Future.
//You can run it as a thread (because it’s Runnable)
//You can get the result (because it’s Future)
public class Futuretaskdemo
{
	    public static void main(String[] args) throws Exception
	    {
	        // Step 1: Create a Callable (normal format)
	        CallableDemo<Integer> task = new CallableDemo<Integer>() 
	        {
	            public Integer call() throws Exception 
	            {
	                return 50 + 50;   // return a result
	            }
	        };

	        // Step 2: Wrap it inside FutureTask
	        FutureTask<Integer> futureTask = new FutureTask<>(task);

	        // Step 3: Run FutureTask using a Thread
	        Thread t = new Thread(futureTask);
	        t.start();

	        // Step 4: Get the result
	        Integer result = futureTask.get();
	        System.out.println("Result = " + result);
	    }
	}
