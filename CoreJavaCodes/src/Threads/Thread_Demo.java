package Threads;
//A thread is small unit of process,which runs independently,it allows us to run multiple task
// same time is called multithreading.

public class Thread_Demo extends Thread	
{
   public void run()
   {
	   System.out.println("Thread is running");
   }
   public static void main(String[]args)
   {
	   Thread_Demo t = new Thread_Demo();
	   t.start();
   }
}
