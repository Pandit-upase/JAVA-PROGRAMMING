/*HERE THE RETURN VALUE FROM FINALLY WILL OVERRIDE THE RETRUN 
VALUE FROM TRY SO OUTPUT WILL BE 20 */
public class returnoveride {
    
    static int test()
    {
        try {
            return 10;
        }
        finally
        {
            return 20;
        }
    }
    public static void main(String[] args) {
        System.out.println(test());
    }
}
