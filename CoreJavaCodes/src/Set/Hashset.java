package Set;
import java.util.*;
/*HASHSET--> Dont't allow duplicates,stores unique elements,internally hashset use hashing to ensure
  uniqueness.It dont't preserve insertion order.
  -Internally uses HashTable.
  
   HASHSET--> When an element is inserted in a Set, Java first 
   calculates its hashcode to find the bucket.
   If there is a collision, it compares elements using equals().
   If equals() returns true, the element is considered duplicate and not inserted.
   If equals() returns false, it is inserted as a new entry.
   So Set ensures uniqueness using both hashCode() and equals().”*/

public class Hashset
{
	    public static void main(String[] args) 
	    {
	        HashSet<String> set = new HashSet<>();

	        // -------- ADD --------
	        set.add("Java");
	        set.add("Python");
	        set.add("C++");
	        set.add("Java");    // duplicate ignored

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

	        // -------- BULK METHODS --------
	        HashSet<String> other = new HashSet<>();
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
	        HashSet<String> cloned = (HashSet<String>) set.clone();
	        System.out.println("cloned set: " + cloned);


	        // -------- CLEAR --------
	        set.clear();
	        System.out.println("After clear(): " + set);
	    }
	}
