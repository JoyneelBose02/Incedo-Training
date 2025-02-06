package com.vehiclerental.userbean.model;

public class Documentsbean {
	 
    private String verificationStatus; // "Verified", "Rejected", etc.

    // Constructor
    public void Documents(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    public void verifyUserDocuments() {
        this.verificationStatus = "Verified";
    }
    public void rejectUserDocuments() {
        this.verificationStatus = "Rejected";
    }

    // View the document verification status
    public void viewDocumentVerificationStatus() {
        System.out.println("Verification Status: " + verificationStatus);
    }
    public String getVerificationStatus() {
        return verificationStatus;
    }

    public void setVerificationStatus(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }
}