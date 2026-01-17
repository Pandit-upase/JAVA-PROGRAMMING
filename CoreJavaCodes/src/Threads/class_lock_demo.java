package Threads;
/*class Lock is a lock applied on the class itself when a static synchronized method is used.
Only one thread can execute any static synchronized method of that class at a time, even if multiple 
objects are created.”

same as static synchronized method->only one thread can access it,belongs to class not object
so it locks the class not any particular object.*/


public class class_lock_demo 
{
	    // static synchronized → CLASS LOCK
	    public static synchronized void printMessage(String msg) 
	    {
	        System.out.println(msg + " ENTERED printMessage()");

	        try 
	        { 
	        	Thread.sleep(500); 
	        } 
	        catch(Exception e) {}

	        System.out.println(msg + " EXITING printMessage()");
	        
	    }
	    public static void main(String[] args) 
	    {
	        // Two separate objects (to prove class lock works across objects)
	    	class_lock_demo obj1 = new class_lock_demo();
	    	class_lock_demo obj2 = new class_lock_demo();

	        // Thread 1
	        Runnable r1 = new Runnable()
	        {
	            public void run()
	            {
	                obj1.printMessage("Thread-1");
	            }
	        };

	        // Thread 2
	        Runnable r2 = new Runnable() 
	        {
	            public void run()
	            {
	                obj2.printMessage("Thread-2");
	            }
	        };

	        new Thread(r1).start();
	        new Thread(r2).start();
	    }
	}

