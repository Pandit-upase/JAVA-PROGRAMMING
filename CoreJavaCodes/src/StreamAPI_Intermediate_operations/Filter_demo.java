package StreamAPI_Intermediate_operations;
import java.util.*;
import java.util.stream.*;

//filter() is an intermediate operation that removes elements that do not satisfy a given condition.
//It returns a new stream with only matching elements.

public class Filter_demo 
{
	    public static void main(String[] args) 
	    {
	        List<Integer> list = Arrays.asList(5, 12, 7, 20, 3);

	        // filter() → keeps only values greater than 10
	        List<Integer> result = list.stream()
	                                   .filter(n -> n > 10) // condition
	                                   .toList();

	        System.out.println(result); // [12, 20]
	    }
	}

