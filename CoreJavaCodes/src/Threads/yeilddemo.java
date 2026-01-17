package Threads;
/*yield() tells the thread scheduler that the current thread is willing to pause
 *and give chance to other threads.

 *yield() does not guarantee any specific order.
  Output is unpredictable because the scheduler may ignore the yield request*/
public class yeilddemo extends Thread
{
  public void run()
  {
	  System.out.println(Thread.currentThread().getName() + "Started");
  
     Thread.yield();
     
     System.out.println(Thread.currentThread().getName() + "Ended");
  }
  
  public static void main(String[]aere)
  {
	  yeilddemo ym1 = new yeilddemo();
	  yeilddemo ym2 = new yeilddemo();
	  
	  ym1.setName("Thread -jack");
	  ym2.setName("Thread -jones");
	  
	  ym1.start();
	  ym2.start();
  }
}
