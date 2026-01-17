package in.sp.test;

import java.sql.*;

public class Batchprocessingdemo {

    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/jdbc_db",
            "root",
            "GOLDY"
        );

        String sql = "UPDATE accounts SET balance = balance + ? WHERE account_number = ?";
        PreparedStatement ps = con.prepareStatement(sql);

        // Account 1
        ps.setDouble(1, 100);
        ps.setString(2, "acc01");
        ps.addBatch();

        // Account 2
        ps.setDouble(1, 100);
        ps.setString(2, "acc02");
        ps.addBatch();

        // Account 3
        ps.setDouble(1, 100);
        ps.setString(2, "acc03");
        ps.addBatch();

        // Execute batch
        int[] result = ps.executeBatch();

        System.out.println("Accounts updated: " + result.length);

        ps.close();
        con.close();
    }
}
