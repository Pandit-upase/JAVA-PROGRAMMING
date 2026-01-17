package Polymorphism;
// Method overriding
public class employee_OR 
{
    void work() 
        {
	        System.out.println("Employee works");
	    }
	}

	class Developer extends employee_OR 
	{
	    @Override
	    void work()
	    {
	        System.out.println("Developer writes code");
	    }
	}

	class Tester extends employee_OR
	{
	    @Override
	    void work() {
	        System.out.println("Tester tests software");
	    }
	}

	class Manager extends employee_OR
	{
	    @Override
	    void work() 
	    {
	        System.out.println("Manager manages team");
	    }
	}

