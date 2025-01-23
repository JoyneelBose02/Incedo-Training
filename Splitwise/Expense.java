package Splitwise;
import java.util.*;
public abstract class Expense {
    protected double totalAmount;
    protected User paidBy;
    protected List<User> participants;

    public Expense(double totalAmount, User paidBy, List<User> participants){
        this.totalAmount = totalAmount;
        this.paidBy = paidBy;
        this.participants = participants;
    }

    public abstract void split();
}
