package Date_Time_API;
import java.time.LocalDate;
import java.time.Period;

//Period is used to measure date-based differences like years, 
//months, and days. It works with LocalDate.
public class period_demo 
{
	    public static void main(String[] args) {

	        LocalDate dob = LocalDate.of(2000, 4, 10);
	        LocalDate today = LocalDate.now();

	        Period age = Period.between(dob, today);

	        System.out.println("Age: " + age.getYears() + " years " +
	                           age.getMonths() + " months " +
	                           age.getDays() + " days");
	    }
	}

