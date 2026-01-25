import java.util.Arrays;
import java.util.List;

public class filtervowelstring {
 
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Apple", "Banana", "Ice", "Orange", "Avocado");

        list.stream()
            .filter(s -> s.length() > 3 &&
                         (s.startsWith("A") || s.startsWith("E") ||
                          s.startsWith("I") || s.startsWith("O") ||
                          s.startsWith("U")))
            .forEach(System.out::println);
    }
}
