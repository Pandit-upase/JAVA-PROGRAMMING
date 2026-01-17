package Linkedlist;
import java.util.*;
public class linkedlistMethods 
{	
	    public static void main(String[] args) {

	        LinkedList<String> list = new LinkedList<>();

	        // -------- ADD METHODS --------
	        list.add("Java");             // [Java]
	        list.add("Python");           // [Java, Python]
	        list.add("Ruby");             // [Java, Python, Ruby]

	        list.addFirst("HTML");        // [HTML, Java, Python, Ruby]
	        list.addLast("CSS");          // [HTML, Java, Python, Ruby, CSS]

	        System.out.println("After add operations: " + list);
	        // Output: [HTML, Java, Python, Ruby, CSS]


	        // -------- GET METHODS --------
	        System.out.println("getFirst(): " + list.getFirst());   // HTML
	        System.out.println("getLast(): " + list.getLast());     // CSS
	        System.out.println("get(2): " + list.get(2));           // Python


	        // -------- REMOVE METHODS --------
	        list.removeFirst();           // removes HTML → [Java, Python, Ruby, CSS]
	        list.removeLast();            // removes CSS → [Java, Python, Ruby]
	        list.remove("Python");        // removes Python → [Java, Ruby]

	        System.out.println("After remove operations: " + list);
	        // Output: [Java, Ruby]


	        // -------- OTHER METHODS --------
	        list.add("Go");               // [Java, Ruby, Go]
	        list.add("Swift");            // [Java, Ruby, Go, Swift]

	        System.out.println("contains(\"Ruby\"): " + list.contains("Ruby"));  
	        // true

	        System.out.println("size(): " + list.size());           
	        // 4

	        System.out.println("isEmpty(): " + list.isEmpty());     
	        // false

	        list.set(1, "Kotlin");        // replace index 1 → [Java, Kotlin, Go, Swift]
	        System.out.println("After set: " + list);
	        // Output: [Java, Kotlin, Go, Swift]


	        // -------- ITERATION --------
	        System.out.print("For-each: ");
	        for (String s : list) {
	            System.out.print(s + " ");     // Java Kotlin Go Swift
	        }
	        System.out.println();


	        // -------- CLEAR --------
	        list.clear();                 // []
	        System.out.println("After clear(): " + list);
	        // Output: []
	    }
	}
