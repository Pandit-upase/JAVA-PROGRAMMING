package Date_Time_API;
import java.time.LocalDate;

//LocalDate represents only the date without time and without timezone.
//It is immutable and thread-safe

public class localdate_demo
{
	    public static void main(String[] args) 
	    {
	        LocalDate today = LocalDate.now(); 
	        System.out.println("Today: " + today);

	        LocalDate dob = LocalDate.of(2000, 5, 10);
	        System.out.println("DOB: " + dob);

	        System.out.println("After 10 days: " + today.plusDays(10));
	        System.out.println("Before 2 months: " + today.minusMonths(2));

	        System.out.println("Year: " + today.getYear());
	        System.out.println("Month: " + today.getMonth());
	        System.out.println("Day: " + today.getDayOfMonth());
	    }
}

