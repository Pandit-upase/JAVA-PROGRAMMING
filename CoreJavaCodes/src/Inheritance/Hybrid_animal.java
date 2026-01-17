package Inheritance;

public class Hybrid_animal 
{
   void eat() 
   {
	System.out.println("Animal eats");   
   }
}

// Single Inheritance
   
   class dog extends Hybrid_animal
   {
	    void bark()
   {
		System.out.println("Dog barks");
   }
}
   
   class cat extends Hybrid_animal
   {
	   void meow()
	   {
		   System.out.println("Cat meows");
	   }
   }
  
