package Linkedlist;
import java.util.*;

public class listiterator
{
	    public static void main(String[] args) 
	    {

	        LinkedList<String> languages1 = new LinkedList<>();

	        languages1.add("Java");       // [Java]
	        languages1.add("Python");     // [Java, Python]
	        languages1.add("JavaScript"); // [Java, Python, JavaScript]

	        // Create a ListIterator
	        ListIterator<String> itr1= languages1.listIterator();

	        // ---------- FORWARD TRAVERSING ----------
	        System.out.println("Forward Traversing:");
	        while (itr1.hasNext()) 
	        {
	            System.out.println(itr1.next());
	        }

	        // ---------- BACKWARD TRAVERSING ----------
	        System.out.println("\nBackward Traversing:");
	        while (itr1.hasPrevious()) 
	        {
	            System.out.println(itr1.previous());
	    }
	        
	        
	        System.out.println("=================================================");
	        System.out.println("using listiterator");
	        
	        ListIterator<String> itr2= languages1.listIterator();
	        
	            while (itr2.hasNext())
	            {
	            String lang = itr2.next();
                 
	            if (lang.equals("Python"))
	            {
	                itr2.set("Python-Updated");
	            }
	            System.out.println(languages1);
	    }
	}
}            
