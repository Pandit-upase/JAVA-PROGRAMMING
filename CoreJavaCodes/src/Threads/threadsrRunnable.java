package Threads;
/*This code creates multiple threads using Runnable.
 Each iteration of the loop creates a new Runnable object and
 starts a new Thread that executes the run() method.
 Each thread prints its own name*/
public class threadsrRunnable implements Runnable
{
   public void run()
   {
	   System.out.println("running " + Thread.currentThread().getName());
   }
   public static void main(String[]arrff)
   {
	   for(int i=0;i<=3;i++)
	   {
	         threadsrRunnable tr=new threadsrRunnable();
	         Thread t=new Thread(tr);
	         t.start();
	   }
   }
}