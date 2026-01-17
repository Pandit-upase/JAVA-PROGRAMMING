package Map;
import java.util.*;
/*	HASHTABLE-->Hashtable is a thread-safe map that stores key–value pairs and does not allow 
 * null keys or null values.It is synchronized, slower than HashMap, and maintains no order.”
 
 Internal-Working->“Hashtable uses hashing just like HashMap.
It uses an array of buckets, calculates index using hashCode(),and handles collisions 
using linked lists.All its methods are synchronized,so only one thread can access it at a time.
Because of this, it is thread-safe but slower.”
 
 */
public class Hashtable_Demo
{	
	    public static void main(String[] args) 
	    {

	        Hashtable<Integer, String> ht = new Hashtable<>();

	        ht.put(1, "A");
	        System.out.println("put(1, A): " + ht);   // {1=A}

	        ht.put(2, "B");
	        System.out.println("put(2, B): " + ht);   // {1=A, 2=B}

	        ht.put(3, "C");
	        System.out.println("put(3, C): " + ht);   // {1=A, 2=B, 3=C}

	        System.out.println("get(2): " + ht.get(2)); // B

	        ht.remove(1);
	        System.out.println("remove(1): " + ht);     // {2=B, 3=C}
	    }
	}
