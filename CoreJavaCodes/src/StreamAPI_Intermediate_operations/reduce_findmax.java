package StreamAPI_Intermediate_operations;
import java.util.*;
//reduce() combines stream elements into a single value
//reduce() is used to aggregate the stream into a single result, such as sum or max.
//Identity is the initial value, and the accumulator function combines values pairwise.

//Use MIN_VALUE because it guarantees every real number is bigger than identity, 
//so reduce can correctly build up to the max.
public class reduce_findmax 
{
	    public static void main(String[] args)
	    {
	        List<Integer> nums = Arrays.asList(5, 12, 8, 20, 3);

	        int max = nums.stream()
	                      .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);

	        System.out.println(max);  // 20
	    }
	}
