package Splitwise;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TableSetup.initialize();
        // Create DAO instances
        UserDAO userDAO = new UserDAO();
        ExpenseDAO expenseDAO = new ExpenseDAO();

        // Create users
        User user1 = User.getInstance("JohnDoe", "john@example.com");
        User user2 = User.getInstance("JaneDoe", "jane@example.com");

        // Save users in DB
        userDAO.saveUser(user1);
        userDAO.saveUser(user2);

        // Add an expense
        Expense expense = new Expense(100.0, user1, Arrays.asList(user1, user2)) {
            @Override
            public void split() {
                // Calculate equal split for simplicity
                double share = totalAmount / participants.size();
                System.out.println("Equal Split: Each owes $" + share);
            }
        };

        expenseDAO.saveExpense(expense);

        // List expenses from DB
        expenseDAO.getAllExpenses().forEach(exp -> System.out.println("Expense: $" + exp.totalAmount));
    }
}
