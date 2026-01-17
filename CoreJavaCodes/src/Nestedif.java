import java.util.*;

public class Nestedif 
{
	public void nested() {
	Scanner sc= new Scanner(System.in);
	int marks = sc.nextInt();
	
	if(marks >= 35) {
	    if(marks >= 75)
	        System.out.println("Distinction");
	    else
	        System.out.println("Pass");
	} else {
	    System.out.println("Fail");
	}
	sc.close();
}
	public static void main(String []args)
	{
		Nestedif nif= new Nestedif ();
		nif.nested();
 }
}
