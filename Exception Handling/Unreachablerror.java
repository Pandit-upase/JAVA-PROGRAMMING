/** IF WE KEEP SUPERCLASSES BEFORE THE SUBCLASSES
 * COMPILER WILL SHOW UNREACHABLE ERROR */
public class Unreachablerror
{
    public static void main(String[] args) {
        
        try {
            int i=Integer.parseInt("SHITAL");
        }
        catch(NumberFormatException ex)
        {
            System.out.println("This handles Numberformateception");
        }
         catch  (Exception ex) 
        {
             System.out.println("This block handles all exception types");
        }
    }
}