package BasiCodes;

import java.util.Scanner;

public class Pallindromenumber 
{
  public static void main(String[] args) {
	

	   Scanner sc =new Scanner(System.in);
	   System.out.println("Enter  a number");
	   
	   int num=sc.nextInt();
	   int original_num=num;
	   
	   int rev=0;
	   
	    while (num!=0) 
	   {
		rev = rev * 10 + num % 10;
		num=num/10;
	}
	    
	    if (original_num==rev)
	    {
	    	System.out.println(original_num + " is pallindrome");
	    }
	    else {
			System.out.println(original_num + "  is not pallindrome");
		}
  }
} 
