package Excception_Handling;

public class customexc_main
{	
	    public static void main(String[] args) 
	    {
	        int age = 15;

	        try {
	            // Step 2: Check condition
	            if (age < 18) 
	            {
	                // Step 3: Throw user-defined exception
	                throw new Customexception("Age must be 18 or above");
	            }

	            System.out.println("Valid age! You can vote.");
	        }
	        catch (Customexception e) 
	        {
	            // Step 4: Handle the exception
	            System.out.println("Caught Exception: " + e.getMessage());
	        }
	    }
	}
