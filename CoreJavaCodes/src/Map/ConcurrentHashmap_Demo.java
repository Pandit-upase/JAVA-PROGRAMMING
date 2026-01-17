package Map;
import java.util.concurrent.*;
/*ConcurrentHashMap-> is a thread-safe version of HashMap that allows multiple threads to read and 
 * write at the same time without blocking the whole map.It never locks the entire map—only 
 * small parts of it—so it is much faster than Hashtable.
 
 Internal-working->ConcurrentHashMap divides the map into small portions (called buckets).
 Instead of locking the whole map, it locks only the bucket where the update is happening.
 Reads happen without locking at all.
 This gives high performance + thread safety.
 It does not allow null keys or null values.
 
 **/
public class ConcurrentHashmap_Demo
{
	    public static void main(String[] args) 
	    {

	        ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<>();

	        chm.put(1, "A");
	        System.out.println("put(1, A): " + chm);   // {1=A}

	        chm.put(2, "B");
	        System.out.println("put(2, B): " + chm);   // {1=A, 2=B}

	        chm.put(3, "C");
	        System.out.println("put(3, C): " + chm);   // {1=A, 2=B, 3=C}

	        chm.replace(2, "BB");
	        System.out.println("replace(2, BB): " + chm); // {1=A, 2=BB, 3=C}

	        chm.remove(3);
	        System.out.println("remove(3): " + chm);   // {1=A, 2=BB}
	    }
	}

