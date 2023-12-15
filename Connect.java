import java.sql.*;

public class Connect {
    public static void main(String[] args) {
        // JDBC URL, username, and password of MySQL server


        String url = "jdbc:mysql://127.0.0.1/ak";
        String user = "......";
        String password = ".....";



        try (
                // Open a connection
                Connection connection = DriverManager.getConnection(url, user, password);
                // Create a statement

        ) {
            // Execute the SQL statement to create the table

        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {

            // Register MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            Connection connection = DriverManager.getConnection(url, user, password);





            // Do something with the connection (e.g., execute SQL queries)



            // Close the connection when done
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}

