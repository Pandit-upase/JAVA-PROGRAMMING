
public class fibonacci
{
 public static void main(String[]args)
 {
	 int num =10;
	 
	 int first=1;
	 int second=1;
	 int third;
	 System.out.println(first);
	 System.out.println(second);
	 
	 for (int i=3; i<=num; i++)
	 {
		 third = first + second;
		 System.out.println(third);
		 first=second;
		 second=third;
	 }
 }
}
