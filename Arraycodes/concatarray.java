import java.util.Arrays;

public class concatarray{
    
    public static void main(String[] args) {
        
        int a[]={1,2,3};
       // int b[]={4,5,6};
        
       int c[]=new int[2* a.length];

        for(int i=0; i<a.length; i++)
        {
            c[i]=a[i];
        }
        for(int i=0; i<a.length; i++)
        {
            c[i+a.length]=a[i];
        }
        System.out.println(Arrays.toString(c));
    }
}
