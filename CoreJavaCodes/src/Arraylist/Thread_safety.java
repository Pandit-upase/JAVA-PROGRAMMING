package Arraylist;
import java.util.*;


public class Thread_safety
{
		    public static void main(String[] args) throws InterruptedException
		    { 

	        // Normal ArrayList
	        List<Integer> list = new ArrayList<>();

	        // Make it thread-safe
	        List<Integer> syncList = Collections.synchronizedList(list);

	        // Thread 1 → adds numbers 1 to 5
	        Thread t1 = new Thread(() -> 
	        {
	            for (int i = 1; i <= 5; i++)
	            {
	                syncList.add(i);
	                System.out.println("Thread 1 added: " + i);
	            }
	        });

	        // Thread 2 → adds numbers 6 to 10
	        Thread t2 = new Thread(() ->
	        {
	            for (int i = 6; i <= 10; i++) 
	            {
	                syncList.add(i);
	                System.out.println("Thread 2 added: " + i);
	            }
	        });

	        // Start both threads
	        t1.start();
	        t2.start();

	        // Wait until both threads finish
	        t1.join();
	        t2.join();

	        // Print final list
	        System.out.println("Final Synchronized List: " + syncList);
	    }
	}

}
