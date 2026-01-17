package Threads;
//Runnable is used to define the work of a thread using the run() method
public class Runnabledemo implements Runnable
{
	    public void run() 
	    {
	        System.out.println("Task is running in thread: " + Thread.currentThread().getName());
	    }
	    public static void main(String[] args) {

	    	Runnabledemo task = new Runnabledemo();     // create runnable object
	        Thread t = new Thread(task);    // pass runnable to thread
	        t.start();                       // start thread
	    }
	}
