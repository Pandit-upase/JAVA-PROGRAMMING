package BasiCodes;

public class swapping 
{  
	public static void main (String []ewqe)
	{
		int a=10,b=20;
		System.out.println("Before Swapping value of a is "+a+"  and value of b is " +b);
		
		//With using third variable
		/*
		int temp=a;
		a=b;
		b=temp;*/
//--------------------------------------------------------------------------------
		
		//Without using third variable
		/*
		a=a+b;
		b=a-b;
		a=a-b;    */
//-------------------------------------------------------------------------
		
		//Using * and /  
	/*	
	    a=a*b;
		b=a/b;
		a=a/b;   
		*/
		
		// Using single statememt
		
		b=a+b-(a=b);
		System.out.println("After Swapping value of a is  "+a+" and value of b is " +b);
		
	}

}
