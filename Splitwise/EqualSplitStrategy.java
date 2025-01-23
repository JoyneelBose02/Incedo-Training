package Splitwise;

import java.util.HashMap;

public class EqualSplitStrategy implements SplitStrategy {
    @Override
    public void calculateSplit(Expense expense) {
        double share = expense.totalAmount / expense.participants.size();
        HashMap<User, Double> split = new HashMap<>();

        for (User user : expense.participants) {
            split.put(user, share);
        }

        System.out.println("Equal Split Calculated: " + split);
    }
}

