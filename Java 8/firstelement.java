import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class firstelement {
    
    public static void main(String[] args) {
        
        List<String>list=Arrays.asList("java", "spring", "boot");

          Optional<String> first = list.stream()
                                     .findFirst();

                                        
                                     first.ifPresent(  System.out::println);

    }
}
