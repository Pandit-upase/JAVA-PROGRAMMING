package StreamAPI_Intermediate_operations;
import java.util.*; 
import java.util.stream.*;

//peek() is used for debugging inside stream pipelines.
//It does not modify data — only observes it.

public class Peek_demo 
{
	    public static void main(String[] args)
	    {
	        List<Integer> list = Arrays.asList(2, 4, 6);

	        List<Integer> result = list.stream()
	                                   .peek(n -> System.out.println("Before Map: " + n)) // debug
	                                   .map(n -> n * 10)
	                                   .peek(n -> System.out.println("After Map: " + n))
	                                   .toList();

	        System.out.println(result);
	    }
	}

