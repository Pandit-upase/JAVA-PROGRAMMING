package Queue;
import java.util.concurrent.*;

/*“BlockingQueue is a thread-safe queue that waits automatically.
If the queue is full, the producer waits.(Producer waits for space)
If the queue is empty, the consumer waits.(consumer waits for data)
It uses internal locks to handle waiting and waking up.”*/

public class Blocking_queue 
{
	
	    public static void main(String[] args) throws Exception 
	    {

	        BlockingQueue<String> bq = new ArrayBlockingQueue<>(2);

	        bq.put("A");  
	        System.out.println("put(A): " + bq);   // [A]

	        bq.put("B");  
	        System.out.println("put(B): " + bq);   // [A, B]
           
	         bq.put("C");  // This will BLOCK because queue is full
	         
	         System.out.println("take(): " + bq.take()); // A
		     System.out.println("After take: " + bq);     // [B]

	       
	    }
	}

