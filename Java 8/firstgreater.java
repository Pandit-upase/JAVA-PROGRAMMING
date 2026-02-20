import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class firstgreater {
    
     public static void main(String[] args) {
        List<Integer> list = Arrays.asList(100,49,27,87,32,27);

        Optional<Integer> result = list.stream()
                                       .filter(n -> n > 50)
                                       .findFirst();

        System.out.println(result.get());
    }
}
