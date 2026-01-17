package Stack;
import java.util.*;
//Hence stack inherits vector,it inherits its methods,this methods are used internally by the
// stack's key operation.
public class vector2stack_methods 
{
	    public static void main(String[] args) 
	    {

	        Stack<String> stack = new Stack<>();

	        stack.addElement("Java");            // addElement() → Vector method
	        stack.addElement("Python");
	        stack.addElement("C++");

	        System.out.println("stack: " + stack);
	        // [Java, Python, C++]
	        
	        System.out.println("size(): " + stack.size());// 3
	        System.out.println("capacity(): " + stack.capacity());// default 10 
	        System.out.println("elementAt(1): " + stack.elementAt(1));// Python
	        

	        stack.set(1, "Python-Updated");      // set() → Vector method
	        System.out.println("after set(): " + stack);
	        // [Java, Python-Updated, C++]

	        stack.remove(2);                     // remove(index) → Vector method
	        System.out.println("after remove(2): " + stack);
	        // [Java, Python-Updated]

	        System.out.println("firstElement(): " + stack.firstElement());// Java
	        System.out.println("lastElement(): " + stack.lastElement());// Python-Updated
	        
	    }
	}
