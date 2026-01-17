package Date_Time_API;
import java.time.LocalTime;
import java.time.Duration;

//Duration is used to measure time-based differences such as hours, 
//minutes, seconds, and nanoseconds. Duration works with time objects 
//like LocalTime or LocalDateTime

public class Duration_demo
{
	    public static void main(String[] args) 
	    {
	        LocalTime start = LocalTime.of(9, 0);
	        LocalTime end = LocalTime.of(12, 30);

	        Duration duration = Duration.between(start, end);

	        System.out.println("Hours: " + duration.toHours());
	        System.out.println("Minutes: " + duration.toMinutes());
	    }
	}

