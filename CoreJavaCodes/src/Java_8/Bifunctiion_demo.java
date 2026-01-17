package Java_8;
import java.util.function.BiFunction;
import java.util.function.Function;
/*BiFunction<T, U, R> takes two inputs and returns one output.
  It has an apply() method to execute logic and an andThen()method to process 
  the result using another Function.It is used where an operation requires two 
  values, like adding two numbers,combining strings, merging objects, etc.*/
public class Bifunctiion_demo 
{
	    public static void main(String[] args) 
	    {
	        // BiFunction: takes 2 integers → returns their sum
	        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

	        // Function: takes integer → returns integer * 10
	        Function<Integer, Integer> multiplyBy10 = n -> n * 10;

	        // andThen: first add, then multiply by 10
	        BiFunction<Integer, Integer, Integer> finalBiFunc =
	                add.andThen(multiplyBy10);

	        // Apply on inputs
	        int result = finalBiFunc.apply(5, 3);  // (5+3)=8 → 8*10 = 80

	        System.out.println(result); // Output: 80
	    }
	}
