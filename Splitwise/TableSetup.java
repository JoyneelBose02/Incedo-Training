package Splitwise;

import java.sql.Connection;
import java.sql.Statement;

public class TableSetup {
    public static void initialize() {
        try (Connection connection = DBConnection.getConnection(); Statement statement = connection.createStatement()) {
            // Create users table
            statement.execute("""
                CREATE TABLE IF NOT EXISTS users (
                    id INT AUTO_INCREMENT PRIMARY KEY,
                    username VARCHAR(50) NOT NULL UNIQUE,
                    email VARCHAR(100) NOT NULL
                );
            """);

            // Create expenses table
            statement.execute("""
                CREATE TABLE IF NOT EXISTS expenses (
                    id INT AUTO_INCREMENT PRIMARY KEY,
                    amount DOUBLE NOT NULL,
                    paid_by INT NOT NULL,
                    FOREIGN KEY (paid_by) REFERENCES users(id)
                );
            """);

            // Create expense_participants table
            statement.execute("""
                CREATE TABLE IF NOT EXISTS expense_participants (
                    expense_id INT NOT NULL,
                    user_id INT NOT NULL,
                    amount DOUBLE NOT NULL,
                    PRIMARY KEY (expense_id, user_id),
                    FOREIGN KEY (expense_id) REFERENCES expenses(id),
                    FOREIGN KEY (user_id) REFERENCES users(id)
                );
            """);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
