package Arraylist;	
import java.util.*;
/*ArrayList is a resizable array which implements of the List interface in Java.
 * It stores elements in a contiguous memory structure and allows duplicate elements, 
 * maintains insertion order,and supports random access.*/

public class Arraylist_demo 
{
    public static void main (String[]alis) 
    {
    	ArrayList<String> list = new ArrayList<>();
    	list.add("Java");
    	list.add("Python");
    	list.add("C");
    	
    
    	//adding at specific index
    	list.add(1,"javascript");
    	  	
    	//get element of that index
        System.out.println(list.get(1));
        
        //set specific element at index
    	list.set(1,"C#");
    	
    	//remove by value
    	//list.remove("C#");
    	
    	//remove by index
    	//list.remove(2);
    
    	System.out.println(list.contains("Java"));
    	
    	System.out.println(list.isEmpty());
    	//list.clear();

    	System.out.println(list);
    	
    	System.out.println("=============================================");
    	
    	System.out.println("Iteration over a list using for and for-each");
    	
    	
    	System.out.println("using for loop");
    	for(int i=0; i<list.size(); i++)
    	{
    		System.out.println(list.get(i));
    	}
    	System.out.println("=============================================");

    	
    	System.out.println("using for-each loop");
    	for(String langlist:list)
    	{
    		System.out.println(langlist);
    	}
    	System.out.println("=============================================");

    	System.out.println("using iterator");
    	//Iterator<String>itr=list.iterator();
    	
    	/*while(itr.hasNext())
    	{
    		System.out.println(itr.next());
    	}*/
    	System.out.println("=============================================");
        
    	System.out.println("terminating fail fast by using iterators remove()");
    	
       /* Iterator<String>itr=list.iterator();
    	
    	while(itr.hasNext())
    	{
    		String lang=itr.next();
    		
    		if(lang.equals("Python"))
    		{
    			itr.remove();
    		}
    	}*/
    	
    	System.out.println("====================================");
    	
    	System.out.println("terminating fail fast by using iterators remove() in for loop");
         
    	for(int i=0; i<list.size(); i++)
    	{
    		if(list.get(i).equals("Java"))
    		{
    			list.remove(i);
    			i--;
    		}
    	}
    	
    	System.out.println(list);

    }
}
