package class_object_constructor;

public class Singleton_main
{
  public static void main(String[]args)
  {
	        Singleton s1 = Singleton.getInstance(); // prints "Object created!"
	        s1.showMessage();

	        Singleton s2 = Singleton.getInstance(); // does not create again
	        s2.showMessage(); 
}
}