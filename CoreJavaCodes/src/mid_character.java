import java.util.*;
public class mid_character 
{
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("Input a string: ");
	 String str = sc.nextLine();

 System.out.println("The middle character in the string: " + str.charAt(str.length()/2));

	        sc.close();
	    }
	}

