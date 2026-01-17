package StreamAPI_Intermediate_operations;
import java.util.*;

//optinal,because there is no identity,if the list is empty → no value to return.

public class reduce_optional 
{
	    public static void main(String[] args) 
	    {
	        List<Integer> nums = Arrays.asList(10, 20, 30);

	        Optional<Integer> result =
	                nums.stream().reduce((a, b) -> a + b);

	        System.out.println(result.get());  // 60
	    }
	}

