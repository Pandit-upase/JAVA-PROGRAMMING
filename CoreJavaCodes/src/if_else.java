import java.util.*;

public class if_else 
{
	public void ifrun() 
	{
	Scanner sc = new Scanner(System.in);
	
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	if(a > b)
	    System.out.println(a + " is big");
	else
	    System.out.println(b + " is big");
	sc.close();
	}
	
	public static void main(String []args)
	{
		if_else iff = new if_else();
		iff.ifrun();
		
	}
}
  
