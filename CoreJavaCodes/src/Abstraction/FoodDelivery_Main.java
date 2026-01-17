package Abstraction;

public class FoodDelivery_Main 
{
	    public static void main(String[] args) 
	    {
	        FoodDelivery f;

	        f = new Swiggy();
	        f.order();
	        f.payment();
	        f.deliver();

	        System.out.println("---------------------");

	        f = new Zomato();
	        f.order();
	        f.payment();
	        f.deliver();
	    }
}
