/*HERE WE ARE DESTROYING THE ARITHMETIC EXCEPTION BY PUTTING
RUNTIMEXCEPTION IN CATCH BLOCK */
public class exedestroying {
    
    static void m1()
    {
        try 
        {
            int a=10/0;
        } 
        catch (ArithmeticException e) 
        {
            //e.printStackTrace();
            throw new RuntimeException("Error in m1");
        }
    }
       static void m2()
       {
        m1();
       }
    public static void main(String[] args) {
        m2();
    }
    }

