package Polymorphism;

public class payment_main_OL 
{
	    public static void main(String[] args) {

	        Payment_OL p = new Payment_OL();

	        p.pay(5000);
	        p.pay("rohit@ybl", 7500);
	        p.pay(9876543210123456L, 123, 12000);
	}
}

