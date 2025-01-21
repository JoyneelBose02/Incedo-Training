package Day3Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Contact {
    private String name;
    private String phoneNumber;

    // Constructor
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for phoneNumber
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone Number: " + phoneNumber;
    }
}

class Phonebook {
    private List<Contact> contacts;

    // Constructor
    public Phonebook() {
        contacts = new ArrayList<>();
    }

    // Method to add a contact
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    // Method to search contacts by name (or part of it)
    public Contact[] searchContactsByName(String name) {
        List<Contact> matchingContacts = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getName().toLowerCase().contains(name.toLowerCase())) {
                matchingContacts.add(contact);
            }
        }
        return matchingContacts.toArray(new Contact[0]); // Convert List to array
    }
}


public class SearchContacts {
    public static void main(String[] args) {
        // Create a phonebook and add some contacts
        Phonebook phonebook = new Phonebook();
        phonebook.addContact(new Contact("Alice Johnson", "123-456-7890"));
        phonebook.addContact(new Contact("Bob Smith", "987-654-3210"));
        phonebook.addContact(new Contact("Alice Walker", "555-123-4567"));
        phonebook.addContact(new Contact("Charlie Brown", "111-222-3333"));
        phonebook.addContact(new Contact("Bob Marley", "444-555-6666"));

        // Prompt the user to enter a search term
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name or part of it to search for: ");
        String searchTerm = input.nextLine();

        // Perform the search and get the results
        Contact[] results = phonebook.searchContactsByName(searchTerm);

        // Print the results
        if (results.length > 0) {
            System.out.println("Found the following contacts:");
            for (Contact contact : results) {
                System.out.println(contact);
            }
        } else {
            System.out.println("No contacts found matching the search term: " + searchTerm);
        }

        input.close();
    }
}

