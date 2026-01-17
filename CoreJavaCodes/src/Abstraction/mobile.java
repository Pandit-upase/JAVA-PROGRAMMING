package Abstraction;
/*Abstract class = cannot create object 
 * + contains abstract/non-abstract methods
 * + child must override abstract methods. 
 * abstract methods cannot be static,because they cannot be overriden but abstract
 * method should override*/


//Abstract class
public abstract class mobile 
{

 // ✔ Concrete static method
 public static void testStatic()
 {
     System.out.println("Static concrete method of Mobile");
 }

 // ✔ Concrete non-static method
 public void test() 
 {
     System.out.println("Non-static concrete method of Mobile");
 }

 // ✔ Abstract non-static method
    public abstract void demo();

 // ❌ static abstract method (NOT ALLOWED) → will give Compile Time Error
 // public static abstract void demo();   // CTE
}

//Child class implementing abstract method
class Samsung extends Mobile {

 @Override
 public void demo() {
     System.out.println("Samsung demo feature implemented");
 }
}

//Main method
class TestMobile {

 public static void main(String[] args) {

     // Calling static method (NO object needed)
     Mobile.testStatic();

     // Creating object of child class (NOT parent)
     Mobile m = new Samsung();
     m.test();     // concrete method
     m.demo();     // abstract method implementation
 }
}

