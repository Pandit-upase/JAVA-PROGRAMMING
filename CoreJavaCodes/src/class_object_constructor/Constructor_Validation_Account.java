package class_object_constructor;

public class Constructor_Validation_Account
{
	    String accountNumber;
	    double balance;

	    // Parameterized constructor with validation
	    Constructor_Validation_Account(String accountNumber, double balance)
	    {

	        if (accountNumber == null || accountNumber.isEmpty()) 
	        {
	            System.out.println("Error: Account number cannot be null or empty!");
	        } 
	        else if (balance < 0) {
	            System.out.println("Error: Balance cannot be negative!");
	        } 
	        else {
	            this.accountNumber = accountNumber;
	            this.balance = balance;
	            System.out.println("Account created successfully!");
	            System.out.println("Account Number: " + this.accountNumber);
	            System.out.println("Balance: " + this.balance);
	        }
	    }

	    public static void main(String[] args) {

	        // Valid account
	        new Constructor_Validation_Account("AC12345", 5000);

	        // Invalid account number
	        new Constructor_Validation_Account("", 2000);

	        // Invalid balance
	        new Constructor_Validation_Account("AC98765", -300);
	    }
	}
