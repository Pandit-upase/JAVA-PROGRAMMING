public class evenodddArray
{
    public static void main(String[] args) {
        
        int a[]={10,20,40,50,70};
        
        int evencount=0;
        int oddcount=0;

        for(int i =0;i<a.length;i++)
        {
            if (a[i] % 2 ==0)
            {
                evencount++;               
            } 
            else
        { 
                oddcount++;
            }
        }
        System.out.println( + evencount);
        System.out.println( + oddcount);
    }
}