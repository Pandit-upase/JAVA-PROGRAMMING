package Vector;
import java.util.*;
//legacy interface used to traverse in vector,Hashtable,stack,
//it has hasMoreElements() to check and nextElement() to fetch the next item.
public class vector_enumeration 
{
	    public static void main(String[] args) 
	    {

	        Vector<String> vec = new Vector<>();
	        vec.add("Java");
	        vec.add("Python");
	        vec.add("C++");
	        vec.add("Ruby");

	        Enumeration<String> e = vec.elements();

	        System.out.println("Using Enumeration:");
	        while (e.hasMoreElements()) 
	        {
	            System.out.println(e.nextElement());
	        }
	    }
	}
