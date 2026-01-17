package StreamAPI_Intermediate_operations;
import java.util.*;
import java.util.stream.*;

//sorted() sorts the stream elements.
//Without comparator → ascending natural order.

public class Sorted_demo 
{
	    public static void main(String[] args) 
	    {
	        List<Integer> list = Arrays.asList(15, 3, 9, 1);

	        // sorted() → natural ascending order
	        List<Integer> result = list.stream()
	                                   .sorted()
	                                   .toList();

	        System.out.println(result); // [1, 3, 9, 15]
	    }
	}

