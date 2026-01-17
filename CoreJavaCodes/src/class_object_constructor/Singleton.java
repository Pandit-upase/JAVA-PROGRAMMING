package class_object_constructor;

public class Singleton 
{
    private static Singleton obj;
    
   // private constructor so no one can create object using 'new'
    private Singleton() 
    {
        System.out.println("Object created!");
    }
    
    public static Singleton getInstance()
    {
        if (obj == null) // first time → object not created
        {   
            obj = new Singleton();
        }
        return obj;          // next time → return already created object
    }
    public void showMessage()
    {
        System.out.println("This is Singleton class.");
    }
}
    
   
