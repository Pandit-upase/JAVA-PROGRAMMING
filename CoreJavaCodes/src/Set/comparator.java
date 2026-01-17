package Set;
import java.util.*;

/* “Comparator is used for custom sorting.
compare() compares two objects and returns negative, positive, or zero.
TreeSet uses compare() to maintain sorted order and detect duplicates.”*/
public class comparator
{
	// Simple Person class (NO Comparable here)
	
	    int age;
	    String name;

	    comparator(int age, String name) 
	    {
	        this.age = age;
	        this.name = name;
	    }

	    public String toString()
	    {
	        return name + " (" + age + ")";
	    }
}
