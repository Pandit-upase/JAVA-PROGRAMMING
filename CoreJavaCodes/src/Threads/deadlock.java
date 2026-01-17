package Threads;
/*Deadlock is a situation in multithreading where two or more threads are permanently 
blocked because each thread is waiting for a resource locked by another thread.
<> Deadlock happens because threads lock resources in opposite order
<>Prevent deadlock by locking resources in the same order in all threads*/
class ResourceA {}
class ResourceB {}
public class deadlock 
{
    public static void main(String[] args) 
    {
	        final ResourceA objA = new ResourceA();
	        final ResourceB objB = new ResourceB();

	        // THREAD 1 → Locks A then tries B
	        Thread t1 = new Thread(new Runnable()
	        {
	            public void run() 
	            {
	                synchronized (objA)
	                {
	                    System.out.println("Thread-1 locked A");

	                    try { Thread.sleep(100); }
	                    
	                    catch(Exception e) {}

	                    System.out.println("Thread-1 trying to lock B...");
	                    synchronized (objB) 
	                    {
	                        System.out.println("Thread-1 locked B");
	                    }
	                }
	            }
	        });

	        // THREAD 2 → Locks B then tries A (REVERSE ORDER → DEADLOCK)
	        Thread t2 = new Thread(new Runnable()
	        {
	            public void run() 
	            {
	                synchronized (objB) 
	                {
	                    System.out.println("Thread-2 locked B");

	                    try { Thread.sleep(100); } 
	                    catch(Exception e) {}

	                    System.out.println("Thread-2 trying to lock A...");
	                    synchronized (objA)
	                    {
	                        System.out.println("Thread-2 locked A");
	                    }
	                }
	            }
	        });

	        // Start both threads
	        t1.start();
	        t2.start();
	    }
	}
