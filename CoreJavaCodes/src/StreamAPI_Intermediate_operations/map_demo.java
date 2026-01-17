package StreamAPI_Intermediate_operations;
import java.util.*;
import java.util.stream.*;
//map() transforms each element into a new value.
//It is used when you want to apply a function to each element.
public class map_demo 
{
	    public static void main(String[] args)
	    {
	        List<Integer> list = Arrays.asList(2, 4, 6);

	        // map() → transforms each value (square)
	        List<Integer> result = list.stream()
	                                   .map(n -> n * n)
	                                   .toList();

	        System.out.println(result); // [4, 16, 36]
	    }
	}

