package Java_8;
import java.util.Arrays;
import java.util.List;

/*Parallel Stream divides the data into multiple chunks and processes them in parallel using 
 * ForkJoinPool’s common worker threads.It improves performance for large datasets because 
 * multiple elements are processed simultaneously.Normal stream uses only the main thread, 
 * while parallel stream uses multiple threads automatically.*/
public class ParallelstreamDemo 
{
	    public static void main(String[] args) 
	    {
	        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

	        // Normal Stream (Sequence Processing)
	        System.out.println("Normal Stream Output:");
	        numbers.stream().forEach(n -> 
	            System.out.println(n + " processed by " + Thread.currentThread().getName())
	        );

	        System.out.println("\nParallel Stream Output:");
	        
	        // Parallel Stream (Multiple Threads)
	        numbers.parallelStream().forEach(n -> 
	            System.out.println(n + " processed by " + Thread.currentThread().getName())
	        );
	    }
	}
