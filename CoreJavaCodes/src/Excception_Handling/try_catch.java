package Excception_Handling;

public class try_catch 
{
 public static void main(String[]afs)
 {
	 int a=10;
	 int b=0;
	 
	 try
	 {
		 int result=a/b;
		 System.out.println(result);
     }
	 catch(ArithmeticException e)
	 {
		 System.out.println("Cant divide by zero");
	 }
  }
}
