package Vector;
import java.util.*;

// vector is a legacy class.with all synchronized methods,so its thread safe,used only in 
// multithreaded environments,internally uses dynamic array,when its full,it doubles the capacity,
// by making copy of an array.
public class vectorDemo 
{
	    public static void main(String[] args) {

	        Vector<String> vec = new Vector<>();

	        // Adding elements
	        vec.add("Java");
	        vec.add("Python");
	        vec.add("C++");
	        vec.add("Ruby");

	        System.out.println("Vector Elements: " + vec);

	        // Accessing elements
	        System.out.println("Element at index 1: " + vec.get(1));  // Python

	        // Updating element
	        vec.set(2, "C");  
	        System.out.println("After Update: " + vec);               // [Java, Python, C, Ruby]

	        // Removing element
	        vec.remove("Ruby");
	        System.out.println("After Removing Ruby: " + vec);        // [Java, Python, C]

	        // Traversing vector
	        System.out.print("Traversing: ");
	        for (String s : vec) 
	        	{
	            System.out.print(s + " ");                           // Java Python C
	        }
	    }
	}
