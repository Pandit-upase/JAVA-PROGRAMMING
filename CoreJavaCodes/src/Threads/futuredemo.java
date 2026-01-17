package Threads;
import java.util.concurrent.*;
/*>Future only stores the result.
  >FutureTask stores the result AND can run as a task because it implements Runnable.*/
public class futuredemo 
{
	    public static void main(String[] args) throws Exception 
	    {
	        ExecutorService service = Executors.newSingleThreadExecutor();

	        // Create a Callable task (normal format)
	        CallableDemo<Integer> task = new CallableDemo<Integer>()
	        {
	            public Integer call() throws Exception 
	            {
	                Thread.sleep(1000);   // simulate delay
	                return 10 + 20;       // result = 30
	            }
	        };

	        // Submit task to executor
	        Future<Integer> future = service.submit(task);

	        System.out.println("Task submitted...");

	        // Check if task is finished
	        System.out.println("Is Done? " + future.isDone());

	        // Get the result (waits until task completes)
	        System.out.println("Result = " + future.get());

	        // After get(), task is finished
	        System.out.println("Is Done Now? " + future.isDone());

	        // Try to cancel task (but it's already done)
	        System.out.println("Cancel? " + future.cancel(true));

	        // Check cancellation status
	        System.out.println("Is Cancelled? " + future.isCancelled());

	        service.shutdown();
	    }
	}
