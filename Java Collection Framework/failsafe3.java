/* USING COPYONARRAYLIST IS THE THIRD WAY TO AVIOD THE FAIL FAST BEHAVIOUR*/
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class failsafe3 
{
    public static void main(String[] args) 
    {
        CopyOnWriteArrayList<Integer>list=new CopyOnWriteArrayList<>();

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
        System.out.println(list);
    }
}// Fail fast behavior
