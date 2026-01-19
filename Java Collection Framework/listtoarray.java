import java.util.ArrayList;

public class listtoarray {
    public static void main(String[] args) {
        
        ArrayList<Integer>list=new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Integer arr[]=list.toArray(new Integer[0]);

        for(Integer l:arr)
        {
                System.out.println(l);
        }

    }
}
