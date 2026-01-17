package Excception_Handling;
//NullPointerException occurs when we try to use an object reference that is null, 
//like calling a method or accessing a variable on null.”
public class NullPointerExceptionDemo
{
    public static void main(String[] args) {

        String s = null;            // s has no object

        try {
            System.out.println(s.length());  // ❌ NPE
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException occurred!");
        }
    }
}
