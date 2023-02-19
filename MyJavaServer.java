import java.sql.*;

public class MyJavaServer {
    public static void main(String[] args) {
        try {
            // Connect to the MySQL database
            Connection connection = DriverManager.getConnection("jdbc:mysql://43.136.17.142:3306/test_db", "User1", "111111");
            
            // Create a statement object
            Statement statement = connection.createStatement();
            
            // Execute a query
            ResultSet resultSet = statement.executeQuery("SELECT * FROM name");
            
            // Process the results
            while (resultSet.next()) {
                resultSet.toString();
                System.out.println(resultSet.toString());
                int id=resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println(id + " " + name +"dd");
            }
            
            // Close the connection
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}