import java.util.*;
import java.util.stream.Collectors;

public class Removeduplicates{

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 2, 8, 2, 10, 5, 3, 8, 12, 7);

        List<Integer> result = numbers.stream()
                .distinct()                // remove duplicates
                .filter(n -> n % 2 == 0)   // keep even numbers
                .sorted()                  // sort ascending
                .collect(Collectors.toList());

        System.out.println("Result: " + result);
    }
}
