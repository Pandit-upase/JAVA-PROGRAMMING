package Access_modifiers;

public class Access_modifiers 
{
	private int a = 10;      // PRIVATE → only inside this class
    int b = 20;      // DEFAULT → same package only
    protected int c = 30;     // PROTECTED → same package + child class
    public int d = 40;        // PUBLIC → anywhere

     public void showValues() 
     {
        System.out.println("Private a = " + a);
        System.out.println("Default b = " + b);
        System.out.println("Protected c = " + c);
        System.out.println("Public d = " + d);
  }
}
