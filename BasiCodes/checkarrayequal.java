package BasiCodes;

import java.util.Arrays;

public class checkarrayequal {
    
	public static void main(String[] args) {
		
		int a1[]= {1,2,3,4,5};
		int a2[]= {1,2,3,8,5};
		
		/*boolean status=Arrays.equals(a1,a2);
		if(status==true)
		{
			System.out.println("Array are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}*/
		
		//boolean status=true;
		
		if(a1.length == a2.length)
		{
			for(int i=0; i<=a1.length-1; i++)
			{
				if(a1[i] != a2[i])
				{
				   //status=false;
					System.out.println("Element are not same");
				}
			}
		}
		else {
			//status=false;
			System.out.println("Arrays are not equal in size so");
		}
		if(a1==a2)
		{
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Array's elements are not equal");
		}
	}
 }
