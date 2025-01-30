package dbConnect;

import java.sql.*;

public class ReadEmployee {
	String url = "jdbc:mysql://localhost:3306/sampledatabase";
	String user = "root";
	String password = "Incedo@1234";
    public void selectALL(String table) {
    	String query = "SELECT * FROM " + table;
    	try(Connection connection = DriverManager.getConnection(url,user,password);
    		Statement statement = connection.createStatement();
    		ResultSet resultSet = statement.executeQuery(query)){
    		
    		while (resultSet.next()) {
                // Retrieve values from the result set
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String email = resultSet.getString("email");

                // Print the values
                System.out.println("ID:" + id + ", Name: " + name + ", Age: " + age + ", Email: " + email);
            }
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}
    	
    }
}
