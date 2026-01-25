import java.util.Arrays;
import java.util.List;

public class filterstrings {
    
    public static void main(String[] args) {
        
        List<String>list=Arrays.asList("Apple","Banana","Avacado");

        list.stream()
                  .filter(s ->s.startsWith("A"))
                  .forEach(System.out::println);
    }
}
