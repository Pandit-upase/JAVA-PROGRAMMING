package Abstraction;
//we can't create object of abstract class,
//because its incomplete blueprint
// can't make static method as abstract

	abstract class FoodDelivery 
	{

	    abstract void payment();     // abstract method → only plan
	    abstract void deliver();     // abstract method

	    void order() 
	    {               // concrete method
	        System.out.println("Order placed successfully");
	    }
	}

	class Swiggy extends FoodDelivery 
	{
	    void payment()
	    {
	        System.out.println("Payment done via UPI");
	    }
	    
	    void deliver()
	    {
	        System.out.println("Swiggy agent delivered the food");
	    }
	}

	class Zomato extends FoodDelivery 
	{
	    void payment() 
	    {
	        System.out.println("Payment done via Card");
	    }
	    
	    void deliver()
	    {
	        System.out.println("Zomato agent delivered the food");
	    }
	}

	