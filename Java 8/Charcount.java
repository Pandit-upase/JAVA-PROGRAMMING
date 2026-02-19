import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Charcount {
    public static void main(String[] args) {
        String input = "java";

        Map<Character, Long> countMap = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        System.out.println(countMap);
    }
}
