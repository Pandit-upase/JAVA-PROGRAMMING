import java.util.ArrayList;

public class removele {
    public static void main(String[] args) {
        
        ArrayList<String>list=new ArrayList<>();
        list.add("Java");
        list.add("python");
        list.add("c++");
        list.add("R");

        list.remove(String.valueOf("python"));
        System.out.println(list);
    }
}
