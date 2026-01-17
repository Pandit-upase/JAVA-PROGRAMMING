package Excception_Handling;
//The finally block is used to write cleanup code that must run whether 
// an exception occurs or not.
public class FinallyDmo 
{
	    public static void main(String[] args)
	    {
	        try {
	            int a = 10 / 0;  // ❌ exception will occur
	            System.out.println(a);
	        }
	        catch (ArithmeticException e) {
	           System.out.println("Exception caught");   // Exception caught
	        }
	        finally {
	            System.out.println("Finally block executed"); // Always runs
	        }

	        System.out.println("End of program"); // Runs after finally
	    }
	}
