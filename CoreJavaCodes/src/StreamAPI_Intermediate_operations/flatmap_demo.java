package StreamAPI_Intermediate_operations;
import java.util.*;

//flatMap is an intermediate operation in Stream API.
//It is used to flatten nested collections into a single stream.
//It applies a function to each element and then flattens the resulting streams into one.

public class flatmap_demo
{
	    public static void main(String[] args)
	    {
	        List<List<Integer>> numbers = Arrays.asList(
	                Arrays.asList(1, 2, 3),
	                Arrays.asList(4, 5),
	                Arrays.asList(6, 7, 8, 9)
	        );

	        numbers.stream()
	               .flatMap(list -> list.stream())
	               .forEach(System.out::println);
	    }
	}

