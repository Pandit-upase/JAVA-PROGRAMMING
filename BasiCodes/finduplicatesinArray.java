package BasiCodes;

import java.util.HashSet;

public class finduplicatesinArray {
           public static void main(String[] args) {
			
        	 /*  String arr[]= {"Java","python","c","c++","Java"};
        	   
        	   boolean flag=false;
        	   for(int i=0;i<arr.length;i++)
        	   {
        		   for(int j=i+1;j<arr.length;j++)
        		   {
        			   if(arr[i]==arr[j])
        			   {
        				   System.out.println("Duplicate found :->" + arr[i]);
        				  flag=true;
        			   }
					}
        		 }
        	   if(flag==false)
        	   {
        		   System.out.println("Duplicate not found");
        	   }*/
        	   
        	   
           	  String arr[]= {"Java","python","c","c++","Java"};
           	   
           	   HashSet<String>langs=new HashSet<>();
           	   
           	 /*  System.out.println(langs.add("Java"));
           	   System.out.println(langs.add("Python"));
           	  System.out.println(langs.add("Java"));*/
           	   
           	  boolean flag=false;
           	  
			for(String l : arr)
           	   {
           		   if(langs.add(l)==false)
           		   {
           			   System.out.println("Found duplicate element");
           			   flag=true;
           		   }
           	   }
			if(flag==false)
			{
				System.out.println("Duplicates not found");
			}
       	           	     
		}
}


