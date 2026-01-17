package Excception_Handling;
import java.util.*;
public class InputmismatchExceptiondemo 
{
	    public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);

	        try {
	            System.out.print("Enter a number: ");
	            int num = sc.nextInt();   // ❌ will throw InputMismatchException if user enters text
	            System.out.println("You entered: " + num);
	        }
	        catch (InputMismatchException e) {
	            System.out.println("InputMismatchException occurred!");
	        }

	        sc.close();
	    }
	}

