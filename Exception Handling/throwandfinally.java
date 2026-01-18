import javax.management.RuntimeErrorException;

public class throwandfinally{
 
    static void test()
    {
        try {
            throw new RuntimeErrorException(null);
        }
        finally
        {
            System.out.println("Finally");
        }
    }
    public static void main(String[] args) {
        test();
        System.out.println("END");
    }
}
