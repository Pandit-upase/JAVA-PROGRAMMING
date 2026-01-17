package class_object_constructor;

public class Bank_main_constructor
{
	    public static void main(String[] args) 
	    {

	        Bank_constructor b1 = new Bank_constructor("Default constructor");
	        Bank_constructor b2 = new Bank_constructor("Rohit Sharma");
	        Bank_constructor b3 = new Bank_constructor("Virat Kohli", 9876543210L, 75000);

	        b1.show();
	        b2.show();
	        b3.show();
	    }
	}

