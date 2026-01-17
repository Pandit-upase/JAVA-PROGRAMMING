package Threads;
/*Deadlock is a situation in multithreading where two or more threads are permanently 
 blocked because each thread is waiting for a resource locked by another thread.
 <> Deadlock happens because threads lock resources in opposite order
 <>Prevent deadlock by locking resources in the same order in all threads*/
class LockA {}
class LockB {}
public class Nodeadlock
{
	    public static void main(String[] args) 
	    {
	        final LockA objA = new LockA();
	        final LockB objB = new LockB();

	        // Thread 1 → A → B
	        Thread t1 = new Thread(new Runnable() 
	        {
	            public void run() 
	            {
	                synchronized (objA) 
	                {
	                    System.out.println("Thread-1 locked A");

	                    try 
	                    { Thread.sleep(100);}
	                    catch(Exception e) {}

	                    System.out.println("Thread-1 trying to lock B...");
	                    synchronized (objB) 
	                    {
	                        System.out.println("Thread-1 locked B");
	                    }
	                }
	            }
	        });

	        // Thread 2 → also A → B (same order)
	        Thread t2 = new Thread(new Runnable() 
	        {
	            public void run() 
	            {
	                synchronized (objA) 
	                {
	                    System.out.println("Thread-2 locked A");

	                    try 
	                    { Thread.sleep(100); }
	                    catch(Exception e) {}

	                    System.out.println("Thread-2 trying to lock B...");
	                    synchronized (objB) 
	                    {
	                        System.out.println("Thread-2 locked B");
	                    }
	                }
	            }
	        });

	        t1.start();
	        t2.start();
	    }
	}
