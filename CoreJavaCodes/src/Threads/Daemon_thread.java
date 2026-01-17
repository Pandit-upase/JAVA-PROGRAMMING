package Threads;
/*A daemon thread is a background thread that provides services to user threads.
It ends automatically when all user threads finish.
We must call setDaemon(true) before start().
Examples include garbage collector and signal handlers.*/
public class Daemon_thread extends Thread
{
	    public void run()
	    {
	        // Keep printing forever (or until user threads die)
	        while(true)
	        {
	            System.out.println("Daemon thread working in background...");
	        }
	    }

	    public static void main(String[] args)
	    {
	    	Daemon_thread d = new Daemon_thread();

	        d.setDaemon(true);   // making the thread a daemon (must be before start())
	        d.start();

	        // User thread (main thread)
	        for (int i = 1; i <= 5; i++)
	        {
	            System.out.println("Main thread running: " + i);
	        }

	        System.out.println("Main thread finished");
	    }
	}
