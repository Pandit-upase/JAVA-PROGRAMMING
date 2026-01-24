import java.util.Arrays;
import java.util.List;

public class countgreater {
 
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 40, 60, 80, 20);
        int target = 30;

        long count = list.stream()
                         .filter(n -> n > target)
                         .count();

        System.out.println(count);
    }
}
