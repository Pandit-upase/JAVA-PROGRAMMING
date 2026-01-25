import java.util.Arrays;
import java.util.List;

public class filters {
    
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 12, 5, 18, 7, 25);

        list.stream()
            .filter(n -> n > 10)
            .forEach(System.out::println);
    }
}
