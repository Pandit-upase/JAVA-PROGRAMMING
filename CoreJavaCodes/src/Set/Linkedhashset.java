package Set;
import java.util.*;
/*Same as hashset,but 
 * it internally uses Hash table + doubly linked list,and maintain insertion order
 * it is used When we want unique + maintain order*/
public class Linkedhashset 
{
	    public static void main(String[] args) 
	    {

	        LinkedHashSet<String> set = new LinkedHashSet<>();

	        // -------- ADD --------
	        set.add("Java");        // [Java]
	        set.add("Python");      // [Java, Python]
	        set.add("C++");         // [Java, Python, C++]
	        set.add("Java");        // duplicate ignored

	        System.out.println("After add(): " + set);


	        // -------- CONTAINS --------
	        System.out.println("contains(\"Python\"): " + set.contains("Python"));

	        // -------- SIZE --------
	        System.out.println("size(): " + set.size());

	        // -------- REMOVE --------
	        set.remove("C++");
	        System.out.println("After remove(): " + set);

	        // -------- REMOVEIF (Java 8) --------
	        set.removeIf(lang -> lang.startsWith("P"));
	        System.out.println("After removeIf(): " + set);

	        // Add again for next operations
	        set.add("HTML");
	        set.add("CSS");
	        set.add("JavaScript");
	        System.out.println("After adding more elements: " + set);

	        // -------- BULK METHODS --------
	        LinkedHashSet<String> other = new LinkedHashSet<>();
	        other.add("Java");
	        other.add("HTML");

	        System.out.println("other: " + other);

	        // retainAll → keeps only common
	        set.retainAll(other);
	        System.out.println("After retainAll(other): " + set);

	        // addAll
	        set.addAll(Arrays.asList("C", "C++", "Go"));
	        System.out.println("After addAll(): " + set);

	        // removeAll
	        set.removeAll(Arrays.asList("C", "Go"));
	        System.out.println("After removeAll(): " + set);

	        // -------- ITERATING --------
	        System.out.print("iterator(): ");
	        Iterator<String> itr = set.iterator();
	        while (itr.hasNext()) 
	        {
	            System.out.print(itr.next() + " ");
	        }
	        System.out.println();


	        // -------- TO ARRAY --------
	        Object[] arr = set.toArray();
	        System.out.println("toArray(): " + Arrays.toString(arr));


	        // -------- CLONE --------
	        LinkedHashSet<String> cloned = (LinkedHashSet<String>) set.clone();
	        System.out.println("cloned set: " + cloned);


	        // -------- CLEAR --------
	        set.clear();
	        System.out.println("After clear(): " + set);
	    }
	}
