package Arraylist;
import java.util.concurrent.CopyOnWriteArrayList;

//CopyOnWrite can make changes in ongoing operation by creating a copy of array.
public class CopyonWriter
{
		    public static void main(String[] args) 
		    {

	        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

	        // Adding elements
	        list.add("Java");
	        list.add("Python");
	        list.add("Ruby");

	        // Iteration does NOT need synchronization
	        for (String s : list) 
	        {
	            System.out.println("Reading: " + s);
	        }

	        // Modify list while iterating (NO ERROR!)
	        for (String s : list)
	        {
	            System.out.println("Inside loop: " + s);

	            // Adding while iterating — safe
	            list.add("New-" + s);
	        }

	        System.out.println("\nFinal List: " + list);
	    }
	}
