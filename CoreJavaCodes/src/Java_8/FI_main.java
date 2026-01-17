package Java_8;

public class FI_main implements FI
{
//In interfaces, ALL methods are public abstract by default.
//So when you override them in a class, they MUST also be public.
	
	@Override
	public void display()
	{
		System.out.println("FROM DISPLAY");
	}
	
	@Override
	  public void show()
	  {
		  System.out.println("FROM SHOW");
	  }
	public static void main(String[]args)
		{
		//FI_main fi =new FI_main();//Child class reference
		FI fi =new FI_main();//interface(parent)reference
		
		fi.display();
		fi.show();
		}
}

