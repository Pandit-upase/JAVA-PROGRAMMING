package Inheritance;
// Grandparent → parent → child
    public class Multilevel_parent
    {	
	    String companyName = "TCS";
	}

	class Child1 extends Multilevel_parent
	{
	    String role = "Developer";
	}

	class Child2 extends Child1 
	{
	    int teamSize = 10;
	}

