package BasiCodes;

public class missingnumberinArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,4,5};
		
		//Here we added the element in the array
		int sum1=0;
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		System.out.println("Sum of elements in array is " + sum1);
		
		
		//Here we added numbers in range
		int sum2=0;
		for(int i=0;i<=5;i++)
		{
			sum2=sum2+i;
		}
		System.out.println("Sum of range of elements in array is " + sum2);
		System.out.println("Missing number in array is " + (sum2-sum1));	
	}
	
}
