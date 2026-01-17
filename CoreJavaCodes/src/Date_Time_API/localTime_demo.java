package Date_Time_API;
import java.time.LocalTime;
//LocalTime represents only time without date and without timezone
public class localTime_demo
{
	    public static void main(String[] args) 
	    {
	        LocalTime time = LocalTime.now();
	        System.out.println("Current Time: " + time);

	        System.out.println("After 2 hours: " + time.plusHours(2));
	        System.out.println("Before 30 minutes: " + time.minusMinutes(30));

	        System.out.println("Hour: " + time.getHour());
	    }
	}
