package Map;
import java.util.*;
/*HASHMAP--> Hashmap is a linear data structure that stores key-value pairs
 *When we insert data using put(), Java first calls the key’s hashCode() to generate a number.
 *That number is then converted into an index to decide which bucket of the HashMap will store
 *the entry. If the bucket is empty, the new key-value pair is stored directly. If the bucket
 *already has entries, a collision occurs — Java checks using equals(): if the key is the same, 
 *it updates the value; if the key is different, it adds a new node in that bucket using a
 * linked list. In Java 8+, if a single bucket grows beyond 8 nodes, the list is converted into 
 * a balanced tree for faster search. When the HashMap becomes 75% full, Java automatically creates
 *  a larger array and rehashes all the entries into new buckets. */
public class Hashmap 
{
	
	    public static void main(String[] args) 
	    {

	        HashMap<Integer, String> map = new HashMap<>();

	        map.put(1, "A");
	        System.out.println("put(1, A): " + map);   // {1=A}

	        map.put(2, "B");
	        System.out.println("put(2, B): " + map);   // {1=A, 2=B}

	        map.put(3, "C");
	        System.out.println("put(3, C): " + map);   // {1=A, 2=B, 3=C}

	        // Duplicate key
	        map.put(2, "BB");
	        System.out.println("put(2, BB): " + map);  // {1=A, 2=BB, 3=C}

	        // get()
	        System.out.println("get(1): " + map.get(1));   // A

	        // containsKey()
	        System.out.println("containsKey(3): " + map.containsKey(3)); // true

	        // remove()
	        System.out.println("remove(3): " + map.remove(3));  // C
	        System.out.println("After remove(3): " + map);      // {1=A, 2=BB}
	    }
	}
