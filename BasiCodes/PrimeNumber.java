package BasiCodes;

//A number greater than 1 and exactly having2 factors.
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number to check");
		int num=sc.nextInt();
		
		int count=0;
		  
		if(num >1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num % i==0)	
				count ++;
			}
			if(count == 2)
			{
				System.out.println("Prime Number");
			}
			else
			{
				System.out.println("Not Prime Number");
			}
	}
		else 
		{
			System.out.println("Not Prime Number");
		}
	}
	
}
