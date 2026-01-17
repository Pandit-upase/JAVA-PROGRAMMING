





















package Polymorphism;

public class Payment_OL 
{
	void pay(double amount) 
	{
        System.out.println("Paid ₹" + amount + " via Cash");
    }

    void pay(String upiId, double amount) 
    {
        System.out.println("Paid ₹" + amount + " via UPI: " + upiId);
    }

    void pay(long cardNumber, int cvv, double amount)
    {
        System.out.println("Paid ₹" + amount + " via Card: " + cardNumber);
    }
}


