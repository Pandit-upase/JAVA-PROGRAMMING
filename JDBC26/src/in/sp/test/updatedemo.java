package in.sp.test;

import java.sql.*;

public class updatedemo 
{
	public static void main(String[]args) throws Exception
	{
         String  city="Delhi";
         String  name="Nikhil";
	
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","GOLDY");
		  
		 PreparedStatement ps=con.prepareStatement("update register set city=? where name=?");
		 ps.setString(1,city);
		 ps.setString(2, name);
		 
		 int i = ps.executeUpdate(); 
		 
		 if(i>0)
		 {
			 System.out.println("updated");
		 }
		 else {
			 {
				System.out.println("Updation fail");
			 }
     }
  }
}
