public class countfreq {
    
    public static void main(String[] args) {
        
        int a[]={1,2,2,3,4,5};

        int target=2;
        int count=0;

        for (int i = 0; i < a.length; i++) 
        {
          if (a[i]==target)
         {
           count++;   
          }    
        }
        System.out.println(count);
    }
}
