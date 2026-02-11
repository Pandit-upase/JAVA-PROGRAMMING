import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);

        Set<Integer> seen = new HashSet<>();
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            Integer value = iterator.next();
            if (!seen.add(value)) {
                iterator.remove();  // Safe removal
            }
        }

        System.out.println(list);
    }
}
