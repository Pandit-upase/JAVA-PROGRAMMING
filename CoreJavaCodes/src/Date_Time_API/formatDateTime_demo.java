package Date_Time_API;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//DateTimeFormatter is used to format and convert date/time objects 
//into readable text as per custom patterns
public class formatDateTime_demo 
{
	    public static void main(String[] args)
	    {
	        LocalDate today = LocalDate.now();

	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

	        String formatted = today.format(formatter);
	        System.out.println("Formatted Date: " + formatted);
	    }
	}


