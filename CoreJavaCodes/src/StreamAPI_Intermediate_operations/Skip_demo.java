package StreamAPI_Intermediate_operations;
import java.util.*;
import java.util.stream.*;

//skip() ignores the first N elements and processes the rest.
//Useful for pagination.

public class Skip_demo 
{
	    public static void main(String[] args) 
	    {
	        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

	        // skip(2) → skip first 2 elements
	        List<Integer> result = list.stream()
	                                   .skip(2)
	                                   .toList();

	        System.out.println(result); // [30, 40, 50]
	    }
	}


