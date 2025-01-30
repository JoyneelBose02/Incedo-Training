package dbConnect;


import java.sql.*;
public class CreateEmployee extends ConnectionDB {
	static String url = "jdbc:mysql://localhost:3306/sampledatabase";
	static String user = "root";
	static String password = "Incedo@1234";
	
	public void createTable(String tableName) {
		String createQuery = "CREATE TABLE IF NOT EXISTS " + tableName + "("
                + "id INT AUTO_INCREMENT PRIMARY KEY, "
                + "name VARCHAR(100), "
                + "age INT(100), "
                + "email VARCHAR(100)"
                + ")";
		
		try(Connection connection = DriverManager.getConnection(url, user, password);
			Statement statement = connection.createStatement()){
			statement.executeUpdate(createQuery);
			System.out.println("Table 'employee' created successfully");
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
