import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class toupperacase {
    
    public static void main(String[] args) {
        
        List<String>list=Arrays.asList("java", "spring", "boot");

        List<String>upperlist = list.stream()
                             .map(String::toUpperCase)
                             .collect(Collectors.toList());
         
         List<String>startj = list.stream()
                           .filter(s -> s.startsWith("j"))
                             .collect(Collectors.toList());

                            System.out.println("Lettr starting with j " + startj);
                             System.out.println("UpperCaseList is "  + upperlist);
    }
}
