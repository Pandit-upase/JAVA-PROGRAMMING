package Threads;
/*object lock is a mechanism that ensures only one thread can access a synchronized method 
 * or synchronized block of an object at a time.*/
public class object_lock 
{
	    // synchronized → uses OBJECT LOCK of this object
	    public synchronized void print(String name) {
	        System.out.println(name + " entered print()");

	        try { Thread.sleep(500); } catch(Exception e) {}

	        System.out.println(name + " leaving print()");
	    }
	    public static void main(String[] args) {

	    	object_lock obj = new object_lock();   // one object → one lock

	        // Thread 1 using normal Runnable
	        Runnable t1 = new Runnable() {
	            public void run() {
	                obj.print("Thread-1");
	            }
	        };

	        // Thread 2 using normal Runnable
	        Runnable t2 = new Runnable() {
	            public void run() {
	                obj.print("Thread-2");
	            }
	        };

	        Thread th1 = new Thread(t1);
	        Thread th2 = new Thread(t2);

	        th1.start();
	        th2.start();
	    }
	}

