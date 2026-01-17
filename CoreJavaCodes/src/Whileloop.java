import java.util.*;
public class Whileloop
{
	//while loop->Checks the condition first then executes the code block,if the
	//condition is false loop will not execute even once.
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        while (n > 0) {
            int temp = n % 10;   // extracting last digit
            sum = sum + temp;    // adding to sum (no +=)
            n = n / 10;           // removing last digit
        }

        System.out.println("Sum of digits = " + sum);
        sc.close();
}
}
