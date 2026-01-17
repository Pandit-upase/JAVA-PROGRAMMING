package BasiCodes;

import java.util.Scanner;

public class Reversenum 
{
   public static void main(String[] args) {
	
	   Scanner sc =new Scanner(System.in);
	   System.out.println("Enter  a number");
	   
	   int num=sc.nextInt();
	 
	   //USING ALGORITHM
	    int rev=0; 
	    while (num!=0) 
	   {
		rev = rev * 10 + num % 10;
		num=num/10;
	}
	   System.out.println("Reversed number is " +rev);
//========================================================================================	   
	   //USING STRING BUFFER
	   StringBuffer sb=new StringBuffer(String.valueOf(num));//<--Converts to string
	   StringBuffer sbrev=sb.reverse();
	   System.out.println(sbrev);

//========================================================================================
	   //USING STRING BUILDER
	   StringBuilder sbl=new StringBuilder();
	   sbl.append(num);
	   sbl.reverse();
	   System.out.println(rev);   
}
}
