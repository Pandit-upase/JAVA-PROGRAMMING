import java.util.ArrayList;
import java.util.Iterator;

public class RemoveEvenNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(30);

        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()) {
            Integer num = itr.next();
            if (num % 2 == 0) {
                itr.remove(); // SAFE removal
            }
        }

        System.out.println(list); // [15, 25]
    }
}
