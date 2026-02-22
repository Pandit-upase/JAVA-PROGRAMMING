
package BasiCodes;

public class Linearsearch {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,50,37,20,};
		
		int search_var=50;
		
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(search_var==a[i]) 
			{
				System.out.println("Element found at index is " + i + " and element is "+a[i]);
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("Element not found");
		}
	}
}
