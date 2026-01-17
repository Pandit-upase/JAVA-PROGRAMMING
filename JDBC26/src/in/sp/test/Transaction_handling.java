package in.sp.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transaction_handling 
{
      public static void main(String[] args)
      {
	 
    	  String url= "jdbc:mysql://localhost:3306/jdbc_db";
    	  String username="root";
    	  String password="GOLDY";
    	  String withdrawQuery="update accounts set balance = balance - ? where account_number=?";
    	  String depositeQuery="update accounts set balance = balance + ? where account_number=?";
    	  
    	  try {
    		  Class.forName("com.mysql.cj.jdbc.Driver");
    		  System.out.println("Drivers loaded successfully");
			} 
    	  catch (ClassNotFoundException e) 
    	  {
			System.out.println(e.getMessage());
		  }
    	  
    	  try {
    			 Connection con= DriverManager.getConnection(url,username,password);
    			 System.out.println("connection established successfully");
    			 con.setAutoCommit(false);
    	  try 
    	  {
    		  PreparedStatement withdrawStatement=con.prepareStatement(withdrawQuery);
    		  PreparedStatement depositeStatement=con.prepareStatement(depositeQuery);
    		  
    		  withdrawStatement.setDouble(1, 500);
    		  withdrawStatement.setString(2, "acc01");
    		  
    		  depositeStatement.setDouble(1, 500);
    		  depositeStatement.setString(2,"acc02");
    		  
    		  withdrawStatement.executeUpdate();
    		  depositeStatement.executeUpdate();
    		  
    		  con.commit();			
    		  System.out.println("Transaction Successful");
		 } 
    	  catch (SQLException e) 
    	  {
			con.rollback();
			System.out.println("Transaction failed");
    	  }}
    	  catch (SQLException e)
    	  {
			System.out.println(e.getMessage());
		}
      }
}
		
  

