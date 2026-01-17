package class_object_constructor;

public class Bank_main 
{
	       public static void main(String[]args)
	       {
	    	   Bank bk1 =new Bank("Rohit Sharma", 9876543210L, 50000);
	    	   Bank bk2 =new Bank("Virat kohli", 987645210L, 56500);
	    	   
	    	   bk1.deposit(10000);
	    	   bk1.withdraw(500);
	    	   bk1.showAccountDetails();
	    	   
	    	   System.out.println("------------------------------");
	    	   
	    	   bk2.withdraw(500);
	    	   bk2.showAccountDetails();
	    	   
	       }
	   }
