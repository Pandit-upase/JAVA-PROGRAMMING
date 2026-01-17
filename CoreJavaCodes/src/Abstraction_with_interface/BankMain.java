package Abstraction_with_interface;

public class BankMain 
{
    public static void main(String[] args) {

        // Calling static method directly (no object required)
        Bank.showBankName();

        Bank b1 = new Bank("Rohit", 50000);
        Bank b2 = new Bank("Virat", 65000);

        b1.showDetails();
        b2.showDetails();

        // 🔹 Changing static variable affects all objects
        Bank.bankName = "HDFC";
        

        System.out.println("----- After changing static variable -----");

        b1.showDetails();
        b2.showDetails();

        // 🔹 Changing final variable NOT allowed — compile time error
        // b1.IFSC = "HDFC1234"; ❌ (final cannot be changed)
    }
}
