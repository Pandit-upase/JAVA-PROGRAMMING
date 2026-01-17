/*Write a Java program to create a class called Classroom 
with instance variables className and students (an array of strings).
Implement a parameterized constructor that initializes these variables. 
Print the values of the variables.*/
package class_object_constructor;

    public class con_arr_ini_classroom 
{
    String  className;
    String[] students;
    
    con_arr_ini_classroom(String  classname,String[] students)
    {
          this.className =classname;
          this.students  =students;
    }
          void display() 
          {
        	  System.out.println("Class Name: " + className);
        //System.out.println("Students:");
        
        for(int i = 0; i < students.length; i++) 
        {
            System.out.println(students[i]);
        }
    }   
        public static void main(String[]args)
   {

       String[] studentList = {"Rahul", "Priya", "Aman", "Sneha"};

       con_arr_ini_classroom c = new con_arr_ini_classroom("Java Batch", studentList);

       c.display();
   }
}
