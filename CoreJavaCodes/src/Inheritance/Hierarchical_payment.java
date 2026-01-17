package Inheritance;
//🔹 One parent → multiple children

public class Hierarchical_payment 
	{
	    void pay()
	    {
	        System.out.println("Payment Process Started");
	    }
	}

	class UPI extends Hierarchical_payment 
	{
	    void upiPay() 
	    { 
	    	System.out.println("Paid via UPI");
	     }
}

	class Card extends Hierarchical_payment 
	{
	    void cardPay()
	    { 
	    	System.out.println("Paid via Card"); 
	    }
}

	