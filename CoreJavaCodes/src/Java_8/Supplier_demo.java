package Java_8;
import java.util.function.Supplier;
/*Supplier is a functional interface in Java that takes no input and returns a value.
  It represents a data producer and is commonly used for random numbers, timestamps, 
  object creation, and lazy evaluation.”*/
public class Supplier_demo 
{
	    public static void main(String[] args) 
	    {
	        // Supplier that returns a random number
	        Supplier<Double> randomSupplier = () -> Math.random();

	        // Supplier that returns a message
	        Supplier<String> messageSupplier = () -> "Hello from Supplier";

	        // Supplier that returns a fixed number
	        Supplier<Integer> numberSupplier = () -> 100;

	        System.out.println(randomSupplier.get()); // prints random number
	        System.out.println(messageSupplier.get()); // prints message
	        System.out.println(numberSupplier.get()); // prints 100
	    }
	}


