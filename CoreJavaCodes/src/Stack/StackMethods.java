package Stack;
import java.util.*;

// A stack is a linear data structure,built on top of vector,since all the operations in vector,
//stack is inherently thread-safe.  
public class StackMethods 
{
	    public static void main(String[] args)
	    {

	        Stack<String> stack = new Stack<>();

	        // ---------- PUSH (add elements) ----------
	        stack.push("Java");          // [Java]
	        stack.push("Python");        // [Java, Python]
	        stack.push("C++");           // [Java, Python, C++]

	        System.out.println("After push: " + stack);
	        // Output: [Java, Python, C++]


	        // ---------- PEEK (view top element) ----------
	        System.out.println("peek(): " + stack.peek());
	        // Output: C++


	        // ---------- POP (remove top element) ----------
	       System.out.println("pop(): " + stack.pop());
	        // Output: C++
	        System.out.println("After pop: " + stack);
	        // Output: [Java, Python]


	        // ---------- SEARCH (1-based position from top) ----------
	        System.out.println("search(\"Java\"): " + stack.search("Java"));
	        // Output: 2 (because Java is 2 positions from top)


	        // ---------- EMPTY (check if stack is empty) ----------
	        System.out.println("empty(): " + stack.empty());
	        // Output: false


	        // ---------- TRAVERSING STACK ----------
	        System.out.print("Traversing: ");
	        for (String s : stack) {
	            System.out.print(s + " ");   // Java Python
	        }
	    }
	}
