import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Descorder {
 
    public static void main(String[] args) {
        
        List<Integer>list=Arrays.asList(3,4,1,9,6);

       List<Integer>Desclist=list.stream()
                            .sorted(Comparator.reverseOrder())
                            .collect(Collectors.toList());

                            System.out.println("List in Desc Order " + Desclist);
    }
}
