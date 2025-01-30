package dbConnect;

import java.sql.*;

public class UpdateEmployee {
	static String url = "jdbc:mysql://localhost:3306/sampledatabase";
	static String user = "root";
	static String password = "Incedo@1234";
	public void update(int id, String newName, int newAge, String newEmail) {
		String updateQuery = "UPDATE employee SET name = ? , age = ?, email = ? WHERE id = ?";
		
		try(Connection connection = DriverManager.getConnection(url,user,password);
			PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)){
			
			preparedStatement.setString(1, newName);
			preparedStatement.setInt(2,newAge);
			preparedStatement.setString(3, newEmail);
			preparedStatement.setInt(4, id);
			
			int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Record updated successfully.");
            } else {
                System.out.println("No records found with the given ID.");
            }
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
