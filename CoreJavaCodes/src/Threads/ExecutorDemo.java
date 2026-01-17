package Threads;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* Executor Framework is a Java mechanism that manages threads for you using thread pools, 
 * so you don’t need to create and manage threads manually*/

public class ExecutorDemo 
{
	    public static void main(String[] args)
	    {
	        // Create an Executor with a pool of 3 threads
	        ExecutorService service = Executors.newFixedThreadPool(3);

	        // Create a simple task
	        Runnable task = new Runnable() 
	        {
	            public void run()
	            {
	                System.out.println("Task executed by: " + Thread.currentThread().getName());
	            }
	        };

	        // Submit tasks to executor
	        service.execute(task);
	        service.execute(task);
	        service.execute(task);
	        service.execute(task);

	        // Stop executor (after completing tasks)
	        service.shutdown();
	    }
}
/*Executor only runs tasks using execute().
  ExecutorService is a sub-interface that adds features like submit(), 
  shutdown(), and Future to manage thread pools properly. */
