package Date_Time_API;
import java.time.LocalDateTime;

//LocalDateTime combines date + time without timezone.

public class localDateTime_demo
{
	    public static void main(String[] args) 
	    {
	        LocalDateTime dt = LocalDateTime.now();
	        System.out.println("Current Date & Time: " + dt);

	        System.out.println("After 1 year: " + dt.plusYears(1));
	        System.out.println("Before 10 days: " + dt.minusDays(10));
	    }
	}

