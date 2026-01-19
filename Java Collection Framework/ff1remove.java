
/*FIRST WAY TO AVOID THE FAIL FAST BEHAVIOUR USING ITR.REMOVE METHOD */
import java.util.*;
public class ff1remove {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) 
            {
            Integer i = it.next();
            if (i == 20) 
            {
                it.remove();   
            }
        }

        System.out.println(list);
    }
}
