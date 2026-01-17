package in.sp.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare;

public class insertdemo 
{
  public static void main(String[]args) throws Exception
  {
	  String name= "Nikhil";
	  String gender="male";
	  String City="Mumbai";
	  String email="Nikhil@gmail.com";
	  String password="Nikhil";
 
	  
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","GOLDY");
	  
	 PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?,?,?)");
	
	 ps.setString(1, name);
	 ps.setString(2, gender);
	 ps.setString(3, City);
	 ps.setString(4, email);
	 ps.setString(5, password);
		 
		 int i = ps.executeUpdate(); 
		 
		 if(i>0)
		 {
			 System.out.println("Data Inserted");
		 }
		 else {
			 {
				System.out.println("Data inserting fail");
			 }
	 }
  }
}
