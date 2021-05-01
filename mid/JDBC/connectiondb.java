
package f2019027009.mid.JDBC;

import java.sql.*;


public class connectiondb {
 
    
     public static void main(String[] args) {
        // TODO code application logic here
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Mid_Data", "root", "")) {
                Statement stmt = (Statement) con.createStatement();
                ResultSet rs = stmt.executeQuery("Select * FROM Cities");
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + " - " + rs.getString(2));
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
}
