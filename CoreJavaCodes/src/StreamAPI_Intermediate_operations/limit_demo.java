package StreamAPI_Intermediate_operations;
import java.util.*;
import java.util.stream.*;

//limit() returns only the first N elements from the stream.
//Useful for pagination and sampling.

public class limit_demo 
{
	    public static void main(String[] args) 
	    {
	        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

	        // limit(3) → takes first 3 elements
	        List<Integer> result = list.stream()
	                                   .limit(3)
	                                   .toList();

	        System.out.println(result); // [10, 20, 30]
	    }
	}


