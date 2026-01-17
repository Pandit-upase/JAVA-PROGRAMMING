package Threads;
/*Synchronization means only one thread can access a shared resources at a time,
 * it is used to prevent race condition in multithreading,In java when multiple thread class can 
 * access the same data.we use SYNCHRONIZED to make it thread-safe*/
public class Synchronization_demo
{
	    int value = 0;

	    // synchronized to prevent race condition
	    public synchronized void changeValue() 
	    {
	        value = value + 1;
	    }
	    
}
 
