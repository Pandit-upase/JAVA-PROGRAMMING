public class exesupression {
    
    static int process()
    {
        try
        {
            int a=10/0;
            return 1;
        }
        catch(ArithmeticException e)
        {
            e.printStackTrace();
            return 2;
           
        }
        finally
        {
            return 3 ;
        }
    }
    public static void main(String[] args) {
        
        System.out.println(process());
    }
        
}
