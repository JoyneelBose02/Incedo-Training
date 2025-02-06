package com.vehiclerental.userbean.model;

import java.util.List;
import java.util.ArrayList;
 
public class Signupbean {
    private List<Userbean> registeredUsers;
 
    // Constructor
    public Signupbean() {
        this.registeredUsers = new ArrayList<>();
    }
 
    public void registerUser(String userId, String name, String email, Documentsbean document, String role) {
        Userbean newUser = new Userbean(userId, name, email, document, role);
        registeredUsers.add(newUser);
    }
 
    // Method to check if a user is an admin
    public boolean isAdmin(String userId) {
        Userbean user = getRegisteredUser(userId);
        return user != null && user.getRole().equalsIgnoreCase("admin");
    }
 
    // Get Registered User by UserId
    public Userbean getRegisteredUser(String userId) {
        for (Userbean user : registeredUsers) {
            if (user.getUserID().equals(userId)) {  
                return user;
            }
        }
        return null;  // If user not found
    }
 
    // Getters and Setters
    public List<Userbean> getRegisteredUsers() {
        return registeredUsers;
    }
 
    public void setRegisteredUsers(List<Userbean> registeredUsers) {
        this.registeredUsers = registeredUsers;
    }
}