package Arraylist;
import java.util.*;

//Can't modify used for only read-only view 
//unmodifiableList → Read-only view of original
//List.of() → Fully independent immutable list
//copyOf() → Immutable copy of original
public class unmodifiable_list
{
	    public static void main(String[] args) 
	    {
	        List<String> list = new ArrayList<>();
	        list.add("Java");
	        list.add("Python");
	        list.add("Ruby");

	        List<String> unmodifiableList = Collections.unmodifiableList(list);

	        System.out.println(unmodifiableList);

	        //unmodifiableList.add("C++");  // ❌ Throws UnsupportedOperationException
	        
	        //list.of is a independent list
	        List<String> sublist= List.of("Java", "Python", "C++");

	        System.out.println(sublist);
	        
	        //list.copyof
	        
	        List<String> copy = List.copyOf(list); 
	        
	        //System.out.println("Original List: " + list);   
	        System.out.println("Copied List: " + copy); 
	        list.add("HTML");
	        System.out.println("Original List after adding HTML	: " + list);
	    }
	}

