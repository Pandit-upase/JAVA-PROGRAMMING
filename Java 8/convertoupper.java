import java.util.Arrays;
import java.util.List;

public class convertoupper {
    
     public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "spring", "api");

        list.stream()
            .map(s -> s.toUpperCase())
            .forEach(System.out::println);
    }
}
