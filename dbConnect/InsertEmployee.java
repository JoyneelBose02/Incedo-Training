package dbConnect;
import java.sql.*;


public class InsertEmployee {
		String url = "jdbc:mysql://localhost:3306/sampledatabase";
		String user = "root";
		String password = "Incedo@1234";

	public void insert(int id, String name, int age, String email) {
	
		String query = "INSERT INTO employee (id,name,age, email) VALUES (?,?,?,?)";
		try(Connection connection = DriverManager.getConnection(url,user,password);
			PreparedStatement preparedStatement = connection.prepareStatement(query)){
			
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setInt(3, age);
			preparedStatement.setString(4, email);
			
			int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Record inserted successfully.");
            }
            
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
