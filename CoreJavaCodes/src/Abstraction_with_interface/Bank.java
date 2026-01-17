package Abstraction_with_interface;

//Displaying Static and Final

class Bank {

    // 🔹 static variable → same for all objects (shared)
    static String bankName = "SBI";

    // 🔹 final variable → value cannot be changed once assigned
    final String IFSC = "SBIN0000456";

    // 🔹 instance variables → different for each object
    String accountHolder;
    double balance;

    // Constructor
    Bank(String accountHolder, double balance) 
    {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // 🔹 static method → can be called without object
    static void showBankName() 
    {
        System.out.println("Welcome to " + bankName);
    }

    // Normal method
    void showDetails()
    {
      System.out.println(accountHolder + " | ₹" + balance + " | "
                                         + bankName + " | " + IFSC);
    }
}

