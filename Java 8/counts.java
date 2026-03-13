import java.util.Arrays;
import java.util.List;

public class counts {
    
    public static void main(String[] args) {
        
         List<String> list = Arrays.asList("java", "go", "spring", "js", "boot");
         
         long count=list.stream()
                           .filter(s ->s.length()>3)
                           .count();
             
               list.stream()
                   .filter(s -> s.length() > 3)
                   .forEach(System.out::println);

                           System.out.println(count);
    }

   
}
