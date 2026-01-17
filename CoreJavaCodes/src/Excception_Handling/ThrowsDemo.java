package Excception_Handling;
//throws is used in the method declaration to tell the caller that the method may throw an exception.
//It does not handle the exception — it only passes responsibility to the caller.
//Here caller is the main method.
public class ThrowsDemo 
{
	    // Method declares it might throw an exception
	    static void division() throws ArithmeticException 
	    {
	        int a = 10 / 0;   // ❌ causes ArithmeticException
	        System.out.println(a);
	    }

	    public static void main(String[] args) {

	        try {
	            division();   // caller must handle it
	        }
	        catch (ArithmeticException e) {
	            System.out.println("Exception handled in main");
	        }
	    }
	}

