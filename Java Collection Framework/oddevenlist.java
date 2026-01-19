import java.util.ArrayList;
import java.util.Iterator;

public class oddevenlist {
 
    public static void main(String[] args) {
        
        ArrayList<Integer>list=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator<Integer>it=list.iterator();
        
        while (it.hasNext()) 
        {
          if (it.next() % 2 == 0)
          {
            it.remove();  
          }    
        }
        System.out.println(list);

    }
}
