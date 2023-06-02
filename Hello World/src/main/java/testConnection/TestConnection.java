package testConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestConnection {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/sensordata_db?user=&password=";

        try {
            // Load the MySQL driver
            Class.forName("com.mysql.jdbc.Driver");

            // Connect to the database
            Connection conn = DriverManager.getConnection(url);
            System.out.println("Connection successful");

            // Execute a SELECT statement to retrieve data from a table
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM your_table_name");

            // Print the retrieved data
            while (rs.next()) {
                System.out.println(rs.getString("column_name1") + ", " + rs.getString("column_name2") + ", " + rs.getString("column_name3"));
            }

            // Close the result set, statement, and connection
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
