package BasiCodes;

public class Binarysearch {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50,60,70,80};
		
		int key=20;
		int lower=0;
		int high=a.length-1;
		boolean flag=false;
		
		while(lower<=high)
		{
			int mid=(lower+high)/2;
			
			if(a[mid]==key)
			{
				System.out.println("Element Found");
				flag=true;
				break;
			}
            
		
			if(key>a[mid])
			{
				lower=mid+1;
			}
			if(key<a[mid])
			{
				high=mid-1;
			}
		}
		if(flag==false)
		{
			System.out.println("Element not found");
		}
	}
}
