package Splitwise;
import java.util.HashMap;

public class PercentageSplitStrategy implements SplitStrategy {
    private HashMap<User, Double> percentages;

    public PercentageSplitStrategy(HashMap<User, Double> percentages) {
        this.percentages = percentages;
    }

    @Override
    public void calculateSplit(Expense expense) {
        HashMap<User, Double> split = new HashMap<>();

        for (User user : expense.participants) {
            double userSplit = (percentages.get(user) / 100) * expense.totalAmount;
            split.put(user, userSplit);
        }

        System.out.println("Percentage Split Calculated: " + split);
    }
}
