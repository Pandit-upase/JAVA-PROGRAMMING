import java.util.*;
   /*“TreeSet is a Set implementation that stores unique elements in sorted order.
It internally uses a Red-Black Tree, which is a self-balancing binary search tree.
Unlike HashSet, TreeSet does not use hashCode() or equals() to check duplicates.
Instead, it uses compareTo() (Comparable) or compare() (Comparator).
If compareTo returns 0, the element is considered duplicate and not added.
All operations like add, remove, search work in O(log n) because of the tree structure.*/

public class Treeset
{
    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(50);   // ts = [50]
        ts.add(10);   // ts = [10, 50]
        ts.add(40);   // ts = [10, 40, 50]
        ts.add(20);   // ts = [10, 20, 40, 50]
        ts.add(10);   // duplicate → ignored → ts = [10, 20, 40, 50]

        System.out.println("After add(): " + ts);
        // Output: [10, 20, 40, 50]

        ts.remove(40);  
        // ts = [10, 20, 50]
        
        System.out.println("After remove(40): " + ts);
        // Output: [10, 20, 50]


        System.out.println("first(): " + ts.first());
        // Output: 10

        System.out.println("last(): " + ts.last());
        // Output: 50


        System.out.print("Traversing: ");
        for (int n : ts) {
            System.out.print(n + " ");  // 10 20 50
        }
    }
}
