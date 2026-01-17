package Excception_Handling;

//Step 1: Create custom exception class
public class Customexception extends Exception
{
	
	    // Constructor for custom message
	    public Customexception(String message) 
	    {
	        super(message);   // Pass message to Exception class
	    }
	}

	