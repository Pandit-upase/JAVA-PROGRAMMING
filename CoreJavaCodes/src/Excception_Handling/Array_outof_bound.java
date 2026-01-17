package Excception_Handling;

public class Array_outof_bound 
{
 public static void main(String[]ewe)
 {
	 int a[]=new int[2];
	 
	 try
	 {
		  a[1]=10;
		 System.out.println(a[1]);
	 }
	 catch(ArrayIndexOutOfBoundsException e)
	 {
		 System.out.println(" " + e);	
	 }
 }
}
