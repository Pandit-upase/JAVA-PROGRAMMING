package Encapsulation;

public class encapsulation 
    {
       
	private String name;
    private double salary;
          
      // getter
           public String getName() 
           {
           return name;
           }
           	
        // setter with validation
           public void setName(String name) {
               if (name == null || name.isEmpty()) 
               {
                   System.out.println("Invalid name!");
               } else 
               {
                   this.name = name;
               }
           }
           
           // getter
           public double getSalary()
           {
               return salary;
           }

           
        // setter with validation (industry standard)
           public void setSalary(double salary)
           {
               if (salary < 0) 
               {
                   System.out.println("Salary cannot be negative!");
               } 
               else 
               {
                   this.salary = salary;
               }
           }
	       
           void showInfo() 
           {
               System.out.println(name + " | ₹" + salary);
           }
    }
