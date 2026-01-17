package Java_8;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comparable_student_main
{
    public static void main(String[] args) {

        List<Comparable_demo_student> list = Arrays.asList(
            new Comparable_demo_student(5, "Ram"),
            new Comparable_demo_student(2, "Sham"),
            new Comparable_demo_student(8, "Sita")
        );

        Collections.sort(list);

        for(Comparable_demo_student s : list) {
            System.out.println(s.roll + " " + s.name);
        }
    }
}