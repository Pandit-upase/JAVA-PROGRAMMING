import java.util.Arrays;
import java.util.Optional;

public class SecondHighest {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 30, 20};

        Optional<Integer> secondHighest =
                Arrays.stream(arr)
                      .boxed()
                      .distinct()
                      .sorted((a, b) -> b - a)
                      .skip(1)
                      .findFirst();

        secondHighest.ifPresentOrElse(
                val -> System.out.println("Second Highest: " + val),
                () -> System.out.println("Not found")
        );
    }
}
