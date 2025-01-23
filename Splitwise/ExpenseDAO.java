package Splitwise;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ExpenseDAO {
    public void saveExpense(Expense expense) {
        String expenseQuery = "INSERT INTO expenses (amount, paid_by) VALUES (?, ?)";
        String participantQuery = "INSERT INTO expense_participants (expense_id, user_id, amount) VALUES (?, ?, ?)";

        try (Connection connection = DBConnection.getConnection()) {
            connection.setAutoCommit(false);

            // Insert expense
            try (PreparedStatement expenseStatement = connection.prepareStatement(expenseQuery, PreparedStatement.RETURN_GENERATED_KEYS)) {
                expenseStatement.setDouble(1, expense.totalAmount);
                expenseStatement.setInt(2, getUserId(expense.paidBy.getUsername(), connection));
                expenseStatement.executeUpdate();

                ResultSet keys = expenseStatement.getGeneratedKeys();
                if (keys.next()) {
                    int expenseId = keys.getInt(1);

                    // Insert participants
                    try (PreparedStatement participantStatement = connection.prepareStatement(participantQuery)) {
                        for (User participant : expense.participants) {
                            double splitAmount = expense.totalAmount / expense.participants.size();
                            participantStatement.setInt(1, expenseId);
                            participantStatement.setInt(2, getUserId(participant.getUsername(), connection));
                            participantStatement.setDouble(3, splitAmount);
                            participantStatement.addBatch();
                        }
                        participantStatement.executeBatch();
                    }
                }
                connection.commit();
            } catch (SQLException e) {
                connection.rollback();
                e.printStackTrace();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Expense> getAllExpenses() {
        List<Expense> expenses = new ArrayList<>();
        String query = "SELECT * FROM expenses";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                double amount = resultSet.getDouble("amount");
                int paidById = resultSet.getInt("paid_by");

                // Create dummy expense object for simplicity
                // You can enhance by loading participants and strategies
                expenses.add(new Expense(amount, getUserById(paidById, connection), new ArrayList<>()) {
                    @Override
                    public void split() {
                    }
                });
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return expenses;
    }

    private int getUserId(String username, Connection connection) throws SQLException {
        String query = "SELECT id FROM users WHERE username = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                return resultSet.getInt("id");
            }
        }
        return -1; // User not found
    }

    private User getUserById(int id, Connection connection) throws SQLException {
        String query = "SELECT username, email FROM users WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String username = resultSet.getString("username");
                String email = resultSet.getString("email");
                return User.getInstance(username, email);
            }
        }
        return null;
    }
}
