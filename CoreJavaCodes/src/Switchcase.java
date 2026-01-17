import java.util.*;
public class Switchcase 
{
public static void main(String []args)
{
	Scanner sc =new Scanner(System.in);
	
	System.out.println("enter first number");
	int num1 =sc.nextInt();
		
	System.out.println("enter second number");
	int num2 =sc.nextInt();
	
	System.out.println("enter operator(+ - / *):");
	char op =sc.next().charAt(0);
	
	int result;
    switch (op) {
        case '+':
            result = num1 + num2;
            System.out.println("Result = " + result);
            break;

        case '-':
            result = num1 - num2;
            System.out.println("Result = " + result);
            break;

        case '*':
            result = num1 * num2;
            System.out.println("Result = " + result);
            break;
            
        case '/':
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result = " + result);
            } else {
                System.out.println("Error: Cannot divide by zero");
            }
            break;
            
            default:
            	System.out.println("Invalid Operator");
}
    sc.close();
}
}
