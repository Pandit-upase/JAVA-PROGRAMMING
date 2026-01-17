package Excception_Handling;
//getMessage() gives the error message of the exception.
//It gives small description of exception.
public class getMessage
{
	    public static void main(String[] args)
	    {
	        try 
	        {
	            int a = 10 / 0;   // ❌ ArithmeticException
	            System.out.println(a);
	        }
	        catch (Exception e) {
	            System.out.println("Message: " + e.getMessage());
	        }
	    }
	}
