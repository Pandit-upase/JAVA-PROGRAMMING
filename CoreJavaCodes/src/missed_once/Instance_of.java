package missed_once;

public class Instance_of 
{
   public static void main(String[]abc)
   {
	   Instance_of io=new Instance_of();
	   System.out.println(io instanceof Instance_of);
   }
}
   class B extends Instance_of
   {
	   public static void main(String[]ewe)
	   {
		   B objB=new B();
		   System.out.println(objB instanceof B);
	   }
   }
