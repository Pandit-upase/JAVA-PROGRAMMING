package Set;
import java.util.*;
public class compareTo_student_main 
{
	public static void main(String[] args) {

        TreeSet<compareTo_student> ts = new TreeSet<>();

        ts.add(new compareTo_student(85, "Ram"));
        ts.add(new compareTo_student(95, "Shyam"));
        ts.add(new compareTo_student(75, "Mohan"));
        ts.add(new compareTo_student(85, "Ravi"));   // duplicate marks → compareTo returns 0 → ignored

        System.out.println(ts);
    }
	}
