package Threads;
import java.util.concurrent.ExecutorService; 
import java.util.concurrent.Executors;

/*Executor Framework manages threads using thread pools.
  It improves performance and avoids creating too many threads.
  We submit tasks and executor runs them using available threads*/
public class ExecutorServicedemo 
{
	    public static void main(String[] args) 
	    {
	        // Create a pool of 3 threads
	        ExecutorService service = Executors.newFixedThreadPool(3);

	        // Create simple tasks
	        Runnable task = new Runnable() 
	        {
	            public void run() 
	            {
	                System.out.println("Task executed by: " + Thread.currentThread().getName());
	            }
	        };
            
	        /*>Even though you submitted 4 tasks, executor uses only 3 threads:
              >3 tasks run immediately (one on each thread)
              >The 4th task waits until any thread becomes free*/
	        	
	        // Submit tasks to executor
	        service.submit(task);
	        service.submit(task);
	        service.submit(task);
	        service.submit(task);

	        // Shutdown executor
	        service.shutdown();
	    }
	}

