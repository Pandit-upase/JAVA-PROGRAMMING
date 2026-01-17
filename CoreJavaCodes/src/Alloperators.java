public class Alloperators 
{
public static void main(String[]args)
{
	int a = 10, b = 3;
	
    System.out.println("Arithmetic Operators:");
    System.out.println("a + b = " + (a + b)); // addition
    System.out.println("a - b = " + (a - b)); // subtraction
    System.out.println("a * b = " + (a * b)); // multiplication
    System.out.println("a / b = " + (a / b)); // division (quotient)
    System.out.println("a % b = " + (a % b)); // remainder
    System.out.println();
//--------------------------------------------------------------------------------------    
    
    //int a = 10, b = 3;
    System.out.println("Relational Operators:");
    System.out.println(a > b);  // true
    System.out.println(a < b);  // false
    System.out.println(a >= b); // true
    System.out.println(a <= b); // false
    System.out.println(a == b); // false
    System.out.println(a != b); // true
    System.out.println();
//---------------------------------------------------------------------------------------
    
    //boolean x = true, y = false;
    System.out.println("Logical Operators:");
    //System.out.println(x && y); // false (AND) T-T =T  else false
    //System.out.println(x || y); // true  (OR)  F-F =F else true
    //System.out.println(!x);     // false (NOT) inverse boolean values
    System.out.println();
//--------------------------------------------------------------------------------------

    
    int y = 43;
    int z = 82;
     
    System.out.println("Bitwise operators");
    
    System.out.println("y & z = " + (y & z));// BW-AND it needs both 1-1   	=1
    System.out.println("a | b = " + (y | z));// BW-OR it needs at least 1-0 =1
    System.out.println("a ^ b = " + (y ^ z));// BW XOR if same then zero 1-1=0,0-0=0
    System.out.println("~a = " + (~y));// BW-NOT 0 becomes 1 becomes 0
    System.out.println("a << 1 = " + (y<< 1));
    System.out.println("a >> 1 = " + (y >> 1));
    
//----------------------------------------------------------------------------------
    
    int p = 5;
    System.out.println("Increment / Decrement Operators:");
    System.out.println(++p); // pre-increment → increases first, prints 6
    System.out.println(p++); // post-increment → prints 6, then becomes 7
    System.out.println(--p); // pre-decrement → decreases first, prints 6
    System.out.println(p--); // post-decrement → prints 6, then becomes 5
    System.out.println();
//------------------------------------------------------------------------------------
    
    int k = 10;
    System.out.println("Assignment Operators:");
    k += 5;   // k = k + 5 → 15
    k -= 3;   // k = k - 3 → 12
    k *= 2;   // k = k * 2 → 24
    k /= 4;   // k = k / 4 → 6
    System.out.println("Final value of k = " + k);
    System.out.println();
//---------------------------------------------------------------------------------------

    int marks = 72;
    String result = (marks >= 35) ? "Pass" : "Fail"; // condition ? true : false
    System.out.println("Ternary Operator:");
    System.out.println("Result = " + result);
}

}
