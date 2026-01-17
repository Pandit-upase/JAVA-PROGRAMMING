import java.util.*;
public class Average
{
	public static void main(String[]args)
	{
	Scanner sc = new Scanner(System.in);
    
	System.out.print("enter first number");
	int f=sc.nextInt();
	
	System.out.print("enter secnd number");
	int s=sc.nextInt();
	
	System.out.print("enter third number");
	int t=sc.nextInt();
	
	System.out.print("enter fourt number");
	int fourth=sc.nextInt();
	
	int avg= (f + s + t + fourth)/5;
	System.out.println("average is" + avg);
	
     }
}
