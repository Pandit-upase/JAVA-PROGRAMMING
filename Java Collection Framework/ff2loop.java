
/*SECOND WAY TO AVIOD FAIL FAST BEHAVIOUR USING INDEX BASED LOOP */
import java.util.*;
public class ff2loop {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        for (int i = 0; i < list.size(); i++)
             {
            if (list.get(i) == 20) 
                {
                list.remove(i);
                i--; 
            }
        }

        System.out.println(list);
    }
}
