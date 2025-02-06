package com.vehiclerental.userbean.model;

public class Userbean {
	private String userID;
    private String name;
    private String email;
    private Documentsbean document;
    private String role;  // "admin" or "user"
 
    // Constructor
    public Userbean(String userID, String name, String email, Documentsbean document, String role) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.document = document;
        this.role = role;
    }
 
    // Getters and Setters
    public String getUserID() {
        return userID;
    }
 
    public void setUserID(String userID) {
        this.userID = userID;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    public Documentsbean getDocument() {
        return document;
    }
 
    public void setDocument(Documentsbean document) {
        this.document = document;
    }
 
    public String getRole() {
        return role;
    }
 
    public void setRole(String role) {
        this.role = role;
    }
}
