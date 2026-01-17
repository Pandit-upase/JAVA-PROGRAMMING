package Set;
/* Comparable is used to define natural ordering of objects by implementing compareTo*/
public class compareTo_student implements Comparable<compareTo_student>
{
	    int marks;
	    String name;

	    compareTo_student(int marks, String name) 
	    {
	        this.marks = marks;
	        this.name = name;
	    }

	    // compareTo decides sorting (by marks)
	    public int compareTo(compareTo_student s)
	    {
	        return this.marks - s.marks;
	    }

	    public String toString() 
	    {
	        return name + " : " + marks;
	    }
	}

	
