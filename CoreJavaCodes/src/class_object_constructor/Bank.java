package class_object_constructor;

public class Bank
{
  private String accountholder;
  private long accountnumber;
  private double balance;
  
  public  Bank (String accountholder,long accountnumber,double balance)
  {
	     this.accountholder=accountholder;
	     this.accountnumber=accountnumber;
	     this.balance=balance; 	 	
  }
  public void deposit(double amount)
  {
	  balance=balance + amount;
	  System.out.println("deposit"+ amount + "added");
  }
  public void withdraw(double amount)
  {
	  if(amount<=balance)
	  {
		  balance=balance - amount;
		  System.out.println(amount +"withdrawn successfully");
		  System.out.println(balance +"remaining balance");
	  }
	  else
		  System.out.println("insufficient balance");
  }
        public void showAccountDetails() 
    {
        	
    System.out.println("Account Holder: " + accountholder);
    System.out.println("Account Number: " + accountnumber);
    System.out.println("Current  Balance: ₹" + balance);
     }
}
   
 
