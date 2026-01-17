package Java_8;
import java.util.*;
//Comparator is used when we want custom sorting. It allows sorting outside the class, 
//supports multiple sorting orders, and has one abstract method compare().
public class Comparator_demo 
{
	    public static void main(String[] args)
	    {
	        List<Integer> numbers = Arrays.asList(10, 5, 30, 20, 15);

	        // -------------------------------
	        // 1️⃣ Comparator WITHOUT Lambda (Anonymous Inner Class)
	        // -------------------------------
	        Comparator<Integer> oldComparator = new Comparator<Integer>() 
	        {
	            @Override
	            public int compare(Integer a, Integer b)
	            {
	                return a - b;   // ascending
	            }
	        };

	        // Sorting using OLD Comparator
	        List<Integer> list1 = new ArrayList<>(numbers);
	        Collections.sort(list1, oldComparator);
	        System.out.println("Sorted using OLD Comparator: " + list1);


	        // -------------------------------
	        // 2️⃣ Comparator WITH Lambda (Java 8)
	        // -------------------------------
	        Comparator<Integer> lambdaComparator = (a, b) -> a - b;

	        // Sorting using Lambda Comparator
	        List<Integer> list2 = new ArrayList<>(numbers);
	        Collections.sort(list2, lambdaComparator);
	        System.out.println("Sorted using LAMBDA Comparator: " + list2);


	        // -------------------------------
	        // 3️⃣ Sort directly using Lambda (Shortest method)
	        // -------------------------------
	        List<Integer> list3 = new ArrayList<>(numbers);
	        Collections.sort(list3,lambdaComparator );//(a, b) -> a - b
	        System.out.println("Sorted using DIRECT Lambda: " + list3);
	    }
	}

//(a, b) -> a - b