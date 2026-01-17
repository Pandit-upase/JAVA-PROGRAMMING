package Encapsulation;

public class encapsulation_main
{
     public static void main(String[]args)
     {
    	 encapsulation e = new encapsulation();

         e.setName("Rohit");        // secure write
         e.setSalary(55000);        // secure write

         e.showInfo();
         
         // Trying to set invalid data
         e.setName("");             // blocked by validation
         e.setSalary(-40000);       // blocked by validation
         
         System.out.println("Name: " + e.getName());       
         System.out.println("Salary: ₹" + e.getSalary());
     }
}
