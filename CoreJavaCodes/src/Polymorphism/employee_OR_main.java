package Polymorphism;

public class employee_OR_main 
{
	    public static void main(String[] args) 
	    {

	    	employee_OR e;  // Parent reference

	        e = new Developer();
	        e.work();

	        e = new Tester();
	        e.work();

	        e = new Manager();
	        e.work();
	    }
	}
