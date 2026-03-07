import java.util.*;
import java.util.stream.*;

public class finduplicates{
    public static void main(String[] args) {

        Integer[] arr = {1,2,3,4,2,5,3};

        Set<Integer> seen = new HashSet<>();

        Set<Integer> duplicates =
                Arrays.stream(arr)
                .filter(n -> !seen.add(n))
                .collect(Collectors.toSet());

        System.out.println("Duplicates " + duplicates);
        System.out.println("Non Duplicates "  + seen);
    }
}