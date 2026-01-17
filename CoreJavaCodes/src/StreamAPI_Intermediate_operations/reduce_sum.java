package StreamAPI_Intermediate_operations;
import java.util.*;

//reduce() is used to aggregate the stream into a single result, such as sum or max.
//Identity is the initial value, and the accumulator function combines values pairwise.

public class reduce_sum
{
	    public static void main(String[] args) 
	    {
	        List<Integer> list = Arrays.asList(10, 20, 30, 40);

	        // identity = 0 (starting value)
	        // accumulator = (a, b) -> a + b
	        int sum = list.stream()
	                      .reduce(0, (a, b) -> a + b);

	        System.out.println(sum);  // 100
	    }
	}

