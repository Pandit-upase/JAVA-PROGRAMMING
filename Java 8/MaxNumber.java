import java.util.*;
public class MaxNumber 
{   
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 7, 2, 9, 5);

        Optional<Integer> max = list.stream()
                                     .max(Integer::compareTo);

        System.out.println(max.get());
    }
}

