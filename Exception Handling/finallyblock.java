/** A FINALLY BLOCK IS ALWAYS EXECUTED WHETHER AN EXCEPTION 
 * IS HANDLED OR NOT */
public class finallyblock {
    
    public static void main(String[] args) {
        
        try {
            int data=25/5;
            System.out.println(data);
        }
         catch (NullPointerException e) 
        {
        System.out.println(e);    
        }
        finally
        {
            System.out.println("This block always executes");
        }
    }
}
