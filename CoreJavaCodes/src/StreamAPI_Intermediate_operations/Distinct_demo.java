package StreamAPI_Intermediate_operations;
import java.util.*;
import java.util.stream.*;
//distinct() removes duplicate elements from the stream using equals().
public class Distinct_demo
{
	    public static void main(String[] args) 
	    {
	        List<Integer> list = Arrays.asList(5, 5, 7, 7, 9);

	        // distinct() → removes duplicates
	        List<Integer> result = list.stream()
	                                   .distinct()
	                                   .toList();

	        System.out.println(result); // [5, 7, 9]
	    }
	}


