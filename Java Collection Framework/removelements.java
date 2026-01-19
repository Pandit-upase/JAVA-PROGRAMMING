import java.util.ArrayList;

public class removelements{
    
    public static void main(String[] args) {
        
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);

        ArrayList<Integer>Unique=new ArrayList<>();

        for(Integer i:list)
        {
            if(!Unique.contains(i))
            {
                Unique.add(i);
            }
        }
        System.out.println(Unique);
    }
    
}
