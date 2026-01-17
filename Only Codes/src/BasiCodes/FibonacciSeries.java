package BasiCodes;

// 0 1 1 2 3 5 8 13 21 34

public class FibonacciSeries {
  
	public static void main(String[] args) {
		
		int num1=0;
		int num2=1;
		int sum=0;
		
		System.out.println(num1 + num2);//0 1
		
		for(int i=2;i<=10;i++)
		{
		  sum=num1 + num2;//0 + 1
		  System.out.println("" + sum);// 1
		  num1=num2;
		  num2=sum;
		}
	}
}
