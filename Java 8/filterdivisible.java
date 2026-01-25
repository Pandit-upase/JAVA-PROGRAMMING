import java.util.Arrays;
import java.util.List;

public class filterdivisible {
    
     public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 15, 20, 30, 45, 50);

        list.stream()
            .filter(n -> n % 3 == 0 && n % 5 == 0)
            .forEach(System.out::println);
    }
}
