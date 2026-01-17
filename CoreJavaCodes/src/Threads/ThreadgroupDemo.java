package Threads;
/*Thread Group is a class used to group multiple threads together.
It allows us to manage threads as a single unit (like checking active threads,
 stopping group, organizing threads).Although not used much today, it is part of 
 legacy Java multithreading.*/
public class ThreadgroupDemo 
{
    public static void main(String[] args) 
    {
	        // Create a thread group
	        ThreadGroup group = new ThreadGroup("MyGroup");

	        // Create thread 1 in this group
	        Thread t1 = new Thread(group, new Runnable()
	        {
	            public void run() 
	            {
	                System.out.println("Thread-1 is running");
	            }
	        }, "Thread-1");

	        // Create thread 2 in this group
	        Thread t2 = new Thread(group, new Runnable() 
	        {
	            public void run() 
	            {
	                System.out.println("Thread-2 is running");
	            }
	        }, "Thread-2");

	        // Start both threads
	        t1.start();
	        t2.start();

	        // Display group info
	        System.out.println("Group Name: " + group.getName());
	        System.out.println("Active Threads: " + group.activeCount());
	    }
	}
