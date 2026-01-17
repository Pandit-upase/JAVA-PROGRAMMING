package in.sp.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Deletedemo 
{
	public static void main(String[]args) throws Exception
	{
         String  city="Delhi";
        // String  name="Nikhil";
	
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","GOLDY");
		  
		 PreparedStatement ps=con.prepareStatement("delete from register where city=?");
		 ps.setString(1,city);
		 
		 int i = ps.executeUpdate(); 
		 
		 if(i>0)
		 {
			 System.out.println("Deleted");
		 }
		 else {
			 {
				System.out.println("Deletion  fail");
			 }
     }
  }
}
