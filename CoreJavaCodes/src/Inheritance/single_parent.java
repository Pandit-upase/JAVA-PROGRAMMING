package Inheritance;
//One parent → one child

public class single_parent 
    {
	    String name;
	    
	    void showName() 
	    {
	        System.out.println("Name: " + name);
	    }
	}

	class single_child extends single_parent
	{
	    double salary;
	    
	    void showSalary() 
	    {
	        System.out.println("Salary: ₹" + salary);
	    }
	}




