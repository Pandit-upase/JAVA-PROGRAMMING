package Map;
import java.util.*;
/*“NavigableMap extends SortedMap and adds navigation methods like
lower, floor, higher, and ceiling to find the closest keys.
TreeMap implements NavigableMap.*/
public class Navigable_Map 
{
	public static void main(String[] args) 
	    {

	        NavigableMap<Integer, String> nm = new TreeMap<>();

	        nm.put(10, "A");
	        nm.put(20, "B");
	        nm.put(30, "C");
	        System.out.println("Initial Map: " + nm);   // {10=A, 20=B, 30=C}

	        System.out.println("lowerKey(20): " + nm.lowerKey(20));     // 10
	        System.out.println("floorKey(20): " + nm.floorKey(20));     // 20
	        System.out.println("higherKey(20): " + nm.higherKey(20));   // 30
	        System.out.println("ceilingKey(15): " + nm.ceilingKey(15)); // 20

	        System.out.println("descendingMap(): " + nm.descendingMap()); // {30=C, 20=B, 10=A}
	    }
	}
