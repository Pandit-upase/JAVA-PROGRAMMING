package Set;

import java.util.Comparator;
import java.util.TreeSet;

public class comparator_main 
{
	 public static void main(String[] args) 
	 {

	        // Comparator that sorts Persons by AGE
	        Comparator<comparator> sortByAge = (p1, p2) -> p1.age - p2.age;

	        // TreeSet with custom Comparator
	        TreeSet<comparator> ts = new TreeSet<>(sortByAge);

	        ts.add(new comparator(25, "Ram"));     // added
	        ts.add(new comparator(30, "Shyam"));   // added
	        ts.add(new comparator(20, "Mohan"));   // added
	        ts.add(new comparator(25, "Ravi"));    // SAME AGE as Ram → compare() = 0 → NOT added

	        System.out.println(ts);
	    }
	}
