package Java_8;
import java.util.function.Predicate;
/*Predicate is a functional interface that takes one input and returns a boolean result.
  It is commonly used for filtering and validation and supports logical operations using and()
  or(),and negate().It has one abstract method called test()*/
public class Predicate_demo 
{
	
	    public static void main(String[] args) 
	    {
	        // Predicate 1: number > 10
	        Predicate<Integer> greater = n -> n > 10;

	        // Predicate 2: number is even
	        Predicate<Integer> even = n -> n % 2 == 0;

	        // AND → both conditions must be true
	        Predicate<Integer> greaterAndEven = greater.and(even);

	        // OR → at least one condition must be true
	        Predicate<Integer> greaterOrEven = greater.or(even);

	        // NEGATE → reverse the condition
	        Predicate<Integer> notEven = even.negate();

	        // Testing
	        System.out.println(greaterAndEven.test(12)); // true (12 > 10 AND even)
	        System.out.println(greaterOrEven.test(7));   // True (7 is not >10 but OR checks even)
	        System.out.println(notEven.test(7));         // true (negate even → odd)
	    }
	}


