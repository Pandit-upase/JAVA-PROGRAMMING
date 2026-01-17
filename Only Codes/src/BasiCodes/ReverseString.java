4package BasiCodes;

import java.util.Iterator;

public class ReverseString {

	public static void main(String[] args) 
	{
		
		String str="ABCD";
		String rev="";
		
		int len=str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
	     System.out.println(rev);
//===================================================================  
	     //USING CHARARRAY
	      char a[]=str.toCharArray();
	      int len1=str.length();
	      
	     for (int i = len1-1; i>=0; i--) 
	     {
		        rev=rev+a[i];	
		 }
	     //System.out.println(rev);
//=====================================================================
	     //USING STRINGBUFFER
	     StringBuffer sbf=new StringBuffer(str);
	     System.out.println(sbf.reverse());
//=====================================================================
	     
		
	}
}
