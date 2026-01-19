import java.util.ArrayList;
import java.util.Iterator;

public class failfast {
    public static void main(String[] args) {
        
        ArrayList<Integer>list=new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

         Iterator<Integer> it = list.iterator();

          while (it.hasNext())
             {
            Integer i = it.next();

            if (i == 20)
            {
                list.add(40);
            }
        }
    }
}
