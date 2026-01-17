import java.util.*;
public class smallest_among3 
{
 public static void main(String[]args)
 {
	 Scanner sc =new Scanner(System.in);
	 
	 System.out.print(" enter first number");
		int f=sc.nextInt();
		
		System.out.print(" enter secnd number");
		int s=sc.nextInt();
		
		System.out.print(" enter third number");
		int t=sc.nextInt();
		
		if(f > s)
			{
				System.out.println(s + " is smaller");
			}
			else if (s > f)
			{
				System.out.println(f + " is smaller ");
			}
			else
			{
				System.out.println(t + " is smaller");
			}
 }
}
