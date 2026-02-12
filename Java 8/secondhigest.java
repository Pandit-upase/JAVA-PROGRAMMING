import java.util.*;

public class secondhigest{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,20,30,40,50,40);

        Optional<Integer> secondHighest = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        secondHighest.ifPresent(System.out::println);
    }
}
