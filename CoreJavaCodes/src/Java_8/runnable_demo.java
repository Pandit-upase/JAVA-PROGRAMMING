package Java_8;

//Runnable interface is a built-in interface in java.lang package,that has a single method run()
//it is used to define code that runs in the thread.

public class runnable_demo implements Runnable
{
	@Override
	    public void run() 
	    {
	        System.out.println("Task Running in Thread: " + Thread.currentThread().getName());
	    }

}

	
