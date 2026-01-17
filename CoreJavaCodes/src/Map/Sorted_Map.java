package Map;
import java.util.*;
/*SortedMap stores keys in ascending sorted order.
It uses the key’s compareTo() or a custom Comparator to maintain sorting.
TreeMap is the main implementation.”*/
public class Sorted_Map
{
	    public static void main(String[] args) 
	    {
	        SortedMap<Integer, String> sm = new TreeMap<>();

	        sm.put(30, "A");
	        System.out.println("put(30, A): " + sm);   // {30=A}

	        sm.put(10, "B");
	        System.out.println("put(10, B): " + sm);   // {10=B, 30=A}

	        sm.put(20, "C");
	        System.out.println("put(20, C): " + sm);   // {10=B, 20=C, 30=A}

	        System.out.println("firstKey(): " + sm.firstKey()); // 10
	        System.out.println("lastKey(): " + sm.lastKey());   // 30
	    }
	}

