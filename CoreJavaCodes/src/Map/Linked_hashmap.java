package Map;
import java.util.*;
/*LinkedHashMap works exactly like HashMap for storing key–value pairs using hashing,
 *but it also maintains a doubly linked list of all entries to preserve the insertion order. 
 *Each entry in LinkedHashMap has normal HashMap fields plus two extra pointers: before and after, 
 *which connect it to the previous and next entries.So when you insert a new key, it is added at 
 *the end of this linked list,and while iterating,you get elements in the same order they were 
 *inserted.Hash operations like put()and get() remain O(1),but the linked list ensures predictable 
 *order without affecting performance.*/
public class Linked_hashmap 
{
	    public static void main(String[] args)
	    {

	        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

	        map.put(1, "A");
	        System.out.println("put(1, A): " + map); // {1=A}

	        map.put(3, "C");
	        System.out.println("put(3, C): " + map); // {1=A, 3=C}

	        map.put(2, "B");
	        System.out.println("put(2, B): " + map); // {1=A, 3=C, 2=B}

	        map.put(3, "CC");
	        System.out.println("put(3, CC): " + map); // {1=A, 3=CC, 2=B}
	    }
	}
