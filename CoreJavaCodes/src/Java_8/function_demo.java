package Java_8;

import java.util.function.Function;
/*Function is a Java 8 functional interface that takes one input and returns one output.
  It represents a transformation of data using the method apply().
  It is used in places where we convert one value to another, such as mapping in Stream API.*/

public class function_demo 
{
    public static void main(String[] args)
    {

        // Function 1: Square of a number
        Function<Integer, Integer> square = n -> n * n;

        // Function 2: Double the number
        Function<Integer, Integer> doubleValue = n -> n * 2;

        // Function 3: Add 10 to number
        Function<Integer, Integer> addTen = n -> n + 10;

        // Using andThen: first square, then double, then add 10
        Function<Integer, Integer> combined =
                square.andThen(doubleValue).andThen(addTen);

        // Testing
        int result = combined.apply(5);

        System.out.println(result); // Output: 5*5=25, 25*2=50, 50+10=60
    }
}
