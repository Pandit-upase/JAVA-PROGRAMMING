package class_object_constructor;

public class Bank_constructor 
{
	    String accountHolder;
	    long accountNumber;
	    double balance;

	    // Default constructor
	    Bank_constructor() 
	    {
	        this("Not Provided",0,0);
	    }

	    // Constructor with name only
	    Bank_constructor(String accountHolder) {
	        this(accountHolder,0,0);
	    }

	    // Constructor with name, number and balance
	    Bank_constructor(String accountHolder, long accountNumber, double balance)
	    {
	        this.accountHolder = accountHolder;
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	    }

	    void show() {
	        System.out.println("Name: " + accountHolder);
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Balance: ₹" + balance);
	        System.out.println("---------------------------");
	    }
	}
