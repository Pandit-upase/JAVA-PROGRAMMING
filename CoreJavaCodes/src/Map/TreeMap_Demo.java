package Map;
import java.util.*;
/*<>TreeMap stores keys in sorted order and internally uses a Red-Black Tree.
So every insertion, deletion, and search takes O(log n) time.

 <>Internal working-->TreeMap does not use hashing.
It stores all keys inside a Red-Black Tree (a balanced binary search tree).
Whenever you insert a key,TreeMap compares it using compareTo() or Comparator and places it in 
sorted position.The tree auto-balances after every insert or delete, so operations stay O(log n).
Because of this, iteration always returns keys in ascending sorted order.”

⭐ One-Line Summary*/
public class TreeMap_Demo 
{
	
	    public static void main(String[] args)
	    {

	        TreeMap<Integer, String> map = new TreeMap<>();

	        map.put(30, "A");
	        System.out.println("put(30, A): " + map); // {30=A}

	        map.put(10, "B");
	        System.out.println("put(10, B): " + map); // {10=B, 30=A}

	        map.put(20, "C");
	        System.out.println("put(20, C): " + map); // {10=B, 20=C, 30=A}

	        System.out.println("firstKey(): " + map.firstKey()); // 10
	        System.out.println("lastKey(): " + map.lastKey());   // 30
	    }
	}
