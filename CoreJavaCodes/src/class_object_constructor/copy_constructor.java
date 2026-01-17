package class_object_constructor;

public class copy_constructor
{       
	String name;
	int age;
     
	//normal constructor
	copy_constructor(String name,int age)
	 {
		this.name = name;
        this.age = age;
        	   
      }
	   
	//copy constructor
	copy_constructor(copy_constructor cr) 
	{
        this.name = cr.name;
        this.age = cr.age;
	}
	
	void show()
	{
	    System.out.println("Name: " + name);
	    System.out.println("Age: " + age);
	}
}
  
