package StreamAPI_Intermediate_operations;
import java.util.*;
//reduce() combines stream elements into a single value
public class reduce_concatenate 
{
	    public static void main(String[] args) 
	    {
	        List<String> words = Arrays.asList("Java", "8", "Stream");

	        String result = words.stream()
	                             .reduce("",(a, b) -> a + " " + b);

	        System.out.println(result.trim()); 
	   }
}
