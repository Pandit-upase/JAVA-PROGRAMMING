package Java_8;

public class greeting_main implements greeting
{
  public static void main(String[]dff)
  {
     //Implementing interface using inner class
    
	 /* it's a basically local inner class where we create an object of class
	  * as well as define its body and override the method.
	  * By this we can use interface without implementing the child class and its method's*/
	  
	  greeting greet1=new greeting(){
		  
		  @Override
		  public void sayhello(String name)
		  {
			  System.out.print("Hello from Anon  " + name);
		  }
	  };
	  
	  //Implementing interface using lambda expression
	  
	 greeting greet2=(name)->{
		  System.out.println("Sonu");
	  };
	  
	  greet1.sayhello("Monu");
	  greet2.sayhello("Sonu");
  }
}
