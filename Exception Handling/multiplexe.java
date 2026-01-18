public class multiplexe {
    
    public static void main(String[] args) {
        
        try {
            int a=10 /2;
            System.out.println(a);
        } 
        catch (Exception e) 
        {
         int b=20 /0;
        }
        finally
        {
            System.out.println("Finally block");
        }
    }
}
