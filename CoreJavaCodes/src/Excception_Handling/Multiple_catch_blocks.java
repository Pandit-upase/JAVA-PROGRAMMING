package Excception_Handling;
import java.util.*;
public class Multiple_catch_blocks 
{
	public static void main(String[]afs)
	 {
		try {
			String s="hii";
			System.out.println(s.length());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic error");
		}
		catch(NullPointerExceptionDemo e )
		{
			System.out.println("Null value used");
		}
		catch(Exception e)
		{
			System.out.println("other  error");
		}
	}
}
