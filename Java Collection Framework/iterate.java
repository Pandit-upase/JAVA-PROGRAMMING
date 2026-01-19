import java.util.ArrayList;

public class iterate {
    
    public static void main(String[] args) {
        
        ArrayList<String>list=new ArrayList<>();
        list.add("Java");
        list.add("python");
        list.add("c++");
        list.add("R");

        for( String lang:list)
        {
            System.out.println(lang);
        }

    }
}
