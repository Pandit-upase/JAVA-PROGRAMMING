package Java_8;
import java.util.concurrent.CompletableFuture;
/*CompletableFuture is an improved Future introduced in Java 8.
  It supports asynchronous execution, chaining, combining tasks, and non-blocking operations.
  It is widely used for running background tasks like API calls and database operations.*/
public class CompleteableFuture_demo
{
	    public static void main(String[] args) 
	    {
	        // Run a task asynchronously (in a separate thread)
	        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> 
	        {
	            System.out.println("Task running in: " + Thread.currentThread().getName());
	            try 
	            {
	            	Thread.sleep(2000); 
	            	}
	            catch (Exception e) 
	            {}
	            System.out.println("Task completed!");
	        });

	        // Continue without blocking main thread
	        System.out.println("Main thread continues...");

	        // join() waits for task to finish (non-exception version of get())
	        future.join();

	        System.out.println("Main thread finished!");
	    }
	}
