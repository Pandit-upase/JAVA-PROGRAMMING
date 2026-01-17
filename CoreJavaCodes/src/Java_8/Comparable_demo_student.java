package Java_8;
/*Comparable has only one abstract method: compareTo().
It is used to define natural sorting order of objects*/
public class Comparable_demo_student implements Comparable<Comparable_demo_student>
{
	
	    int roll;
	    String name;

	    Comparable_demo_student(int roll, String name) 
	    {
	        this.roll = roll;
	        this.name = name;
	    }

	    @Override
	    public int compareTo(Comparable_demo_student other) {
	        return this.roll - other.roll;  // ASC sorting
	    }
	}

	


