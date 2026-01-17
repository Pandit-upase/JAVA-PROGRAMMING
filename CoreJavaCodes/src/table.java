import java.util.*;
public class table
{
   public static void main(String[]args)
   {
	   Scanner sc =new Scanner(System.in);
	   
	   System.out.println("ENTER TABLE YOU WANT");
	   int tab=sc.nextInt();
	   
	   for(int i=1; i<=10; i++)
	   {
		   int mul=tab*i;
		   System.out.println(tab + "x"+ i + "=" +mul);
		   
	   }
   }
}
