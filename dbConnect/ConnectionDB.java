package dbConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
	private final String url = "jdbc:mysql://localhost:3306/sampledatabase";
	private final String user = "root";
	private final String password = "Incedo@1234";
	public void connect() {
		try(Connection connection = DriverManager.getConnection(url,user,password)){
			if(connection != null) {
				System.out.println("Connected to the database!");
			}
		}catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to connect to the database.");
        }
	}
    // Initialize the connection
	
}

