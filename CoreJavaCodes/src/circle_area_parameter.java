import java.util.*;
public class circle_area_parameter
{
public static void main(String []args)
{
	Scanner sc = new Scanner(System.in);

    System.out.print("Enter radius of the circle: ");
    double r = sc.nextDouble();
    
    double area=Math.PI*r*r;
    double perimeter=Math.PI*r;
    
    System.out.println("Area = " + area);
    System.out.println("Perimeter = " + perimeter);

    sc.close();
}
}
