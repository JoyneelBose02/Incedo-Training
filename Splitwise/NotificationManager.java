package Splitwise;
import java.util.*;
public class NotificationManager {
    private List<User> observers = new ArrayList<>();

    public void addObserver(User user){
        observers.add(user);
    }
    public void removeObserver(User user){
        observers.remove(user);
    }
    public void notifyObservers(String message){
        for(User user: observers){
            System.out.println("Notification sent to " + user.getUsername() + ": " + message);
        }
    }
}
