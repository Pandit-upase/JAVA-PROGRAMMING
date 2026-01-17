package Threads;
/*volatile ensures that a variable’s latest value is always read from main memory, 
 * not from thread’s cache.*/
public class VolatileKeyword extends Thread
{
   volatile int number=10;
   
   public void run()
   {
	   System.out.println("Thread running");
	   System.out.println("value of number " + number);
   }
   
   public static void main(String[]sfs)
   {
	   VolatileKeyword vk=new VolatileKeyword();
	   
	   vk.number=50;
	   vk.start();
   }
}
