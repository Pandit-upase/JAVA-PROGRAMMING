package class_object_constructor;

/* Constructor overloading allows multiple constructors 
   with different parameter lists in the same class so
   objects can be initialized in different ways. It 
   avoids using setters later by setting values during 
   object creation itself*/

public class Bank_const_ovl 
{
	String accountHolder;
    long accountNumber;
    double balance;
     
    //Default constructor
    Bank_const_ovl ()
    {
    	this.accountHolder="";
    	this.accountNumber= 0;
    	this.balance= 0;
    }
    
    //constructor with name only
     Bank_const_ovl (String accountHolder) 
    {
        this.accountHolder = accountHolder;
        this.accountNumber = 0;
        this.balance = 0;
    }
     
     
  // Constructor with name & account number
     Bank_const_ovl(String accountHolder, long accountNumber) 
     {
         this.accountHolder = accountHolder;
         this.accountNumber = accountNumber;
         this.balance = 0;
     }
     
  // Constructor with all details
     Bank_const_ovl(String accountHolder, long accountNumber, double balance) 
     {
         this.accountHolder = accountHolder;
         this.accountNumber = accountNumber;
         this.balance = balance;
     }
     
     void show() {
         System.out.println("Name: " + accountHolder);
         System.out.println("Account Number: " + accountNumber);
         System.out.println("Balance: ₹" + balance);
         System.out.println("--------------------------------");
     }
    
}
