import java.util.ArrayList;

public class elecontains {
            public static void main(String[] args) {
        
        ArrayList<String>list=new ArrayList<>();
        list.add("Java");
        list.add("python");
        list.add("c++");
        list.add("R");


        if(list.contains("Java"))
        {
            System.out.println("Element found");
        }
        else
        {
            System.out.println("Element not found");
        }
    }
    
}
