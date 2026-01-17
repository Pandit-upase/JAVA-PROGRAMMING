package class_object_constructor;

public class copy_const_main 
{
   /*A copy constructor copies 
	an object's data into a new object.
	It is useful when we need a backup or clone 
	of an object without affecting the original object.*/
	
	public static void main(String []args)
	{
		
		copy_constructor s1 = new copy_constructor("Rohit", 22);
		copy_constructor s2 = new copy_constructor(s1); 
		
		s2.name="Pandit";
		s2.age=30;
		
		s1.show();
		s2.show();
		
	}
}
