package dbConnect;
import java.sql.*;
public class DeleteEmployee {
	String url = "jdbc:mysql://localhost:3306/sampledatabase";
	String user = "root";
	String password = "Incedo@1234";
	public void deleteEmp(int id) {
		String deleteQuery = "DELETE FROM employee where id = ?";
		try(Connection connection = DriverManager.getConnection(url,user,password);
			PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)){
			preparedStatement.setInt(1, id);
			int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Record deleted successfully.");
            } else {
                System.out.println("No records found with the given ID.");
            }
            
		}catch(SQLException e) {
            e.printStackTrace();
       }
	}
}
