package Excception_Handling;

public class NumberformatExceptionDemo 
{
	    public static void main(String[] args) 
	    {

	        String str = "abc";   // not a number

	        try {
	            int num = Integer.parseInt(str);   // ❌ causes NumberFormatException
	            System.out.println(num);
	            }
	        catch (NumberFormatException e)
	        {
	            System.out.println("NumberFormatException occurred!");
	        }
	    }
	}

