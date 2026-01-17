package class_object_constructor;
 /* Constructor chaining is the process where one 
  * constructor calls another constructor in the same
  * class using this() or in the parent class using super() 
  * to reuse initialization code and avoid duplication.*/
public class const_chain1
{
	const_chain1() {
        this(7);
        System.out.println("this is a default constructor of demo class");
    }

    const_chain1(int c) {
        System.out.println("This is integer constuctor of demo class");
    }
}
