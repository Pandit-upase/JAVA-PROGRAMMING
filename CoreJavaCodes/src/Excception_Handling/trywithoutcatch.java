package Excception_Handling;
//In Java, we can use a try block without a catch block, but only if we use a finally block.
//The finally block ensures cleanup code runs even if no catch block is present.
public class trywithoutcatch 
{
	    public static void main(String[] args) 
	    {
	        try {
	            System.out.println(10 / 0);   // ❌ exception occurs
	        }
	        finally {
	            System.out.println("Finally block executed"); // Always runs
	        }

	        System.out.println("End of program"); // Will NOT run (program stops)
	    }
	}
