package Splitwise;
import java.util.*;
public class User {
    private static User instance = null;
    private String username;
    private String email;
    //Creating a constructor for the class
    private User(String username, String email){
        this.username = username;
        this.email = email;
    }

    private static HashMap<String, User> userMap = new HashMap<>();

    //Singleton pattern
    public static synchronized User getInstance(String username,String email){
        if(!userMap.containsKey(username)){
            userMap.put(username, new User(username, email));
        }
        return userMap.get(username);
    }
    public String getUsername(){
        return username;
    }
    public String getEmail(){
        return email;
    }
}
