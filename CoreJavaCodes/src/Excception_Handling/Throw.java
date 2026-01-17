package Excception_Handling;
//throw is used to manually create and throw an exception in Java.”
//You use throw when you want to force an exception yourself.
public class Throw
{
	    public static void main(String[] args)
	    {

	        int age = 15;

	        if (age < 18) 
	        {
	            throw new ArithmeticException("Not eligible for vote");
	        }

	        System.out.println("You can vote");
	    }
	}
