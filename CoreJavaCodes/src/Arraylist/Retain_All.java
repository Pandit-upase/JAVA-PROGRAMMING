package Arraylist;
import java.util.ArrayList; 
import java.util.Arrays;

// retainAll keep only common elements and remove others.
public class Retain_All 
{
	public static void main (String[]alis)
    {
    	ArrayList<String> list1 = new ArrayList<>();
    	list1.add("Java");
    	list1.add("Python");
    	list1.add("C");
    	list1.add("Ruby");

    	ArrayList<String> list2 = new ArrayList<>();
    	list2.add("Java");
    	list2.add("Python");
    	
    	list1.retainAll(list2);
    	{
    		System.out.println(list1);
    	}
  
    	System.out.println("===========================================");
    	
    	System.out.println("Before removing " +list1);
    	
    	System.out.println("===========================================");
   
    	//removeIf() removes all elements that satisfy a given condition 
    	//using a Java 8 lambda predicate
    	list2.removeIf(str -> str.startsWith("J"));
    	System.out.println("After removing" + list2);
    	
    	
    	System.out.println("===========================================");
 //ContainsAll checks whether all the elements of a given collection are present in 
//the main list,even if one element is missed it returns false.
    	ArrayList<String> check1=  new ArrayList<> (Arrays.asList("Java","Python"));
    	ArrayList<String> check2 = new ArrayList<> (Arrays.asList("HTML","CSS"));
    	
    	System.out.println(list1);
    	System.out.println(list1.containsAll(check1));
    	System.out.println(list1.containsAll(check2));


    }
}