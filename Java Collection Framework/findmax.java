import java.util.Arrays;
import java.util.List;

public class findmax {
    
    public static void main(String[] args) {
        
        List<Integer>numbers=Arrays.asList(10,45,3,88,0);

        int max=numbers.get(0);

        for(int i=1; i<numbers.size(); i++ )
        {
              if (numbers.get(i)>max) 
             {
                 max=numbers.get(i);
            }
        }
        System.out.println(max);
    }
}
