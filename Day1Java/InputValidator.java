package Day1Java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.*;

public class InputValidator {

    // Method to validate name (alphanumeric only)
    public static boolean isValidName(String name) {
        String regex = "^[a-zA-Z0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    // Method to validate email
    public static boolean isValidEmail(String email) {
        // Regular expression for email validation
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    // Method to validate date (in format yyyy-MM-dd)
    public static boolean isValidDate(String date) {
        // Define the expected date format
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        sdf.setLenient(false); // Prevents invalid date like 2025-02-30
        try {
            sdf.parse(date);
            return true;
        } catch (ParseException e) {
            return false; 
        }
    }

    public static void main(String[] args) {
        // Sample inputs
        String name = "John123";  // example name
        String email = "example@example.com";  // example email
        String date = "20-01-2025";  // example date

        // Validate the inputs
        if (isValidName(name)) {
            System.out.println("Valid name");
        } else {
            System.out.println("Invalid name");
        }

        if (isValidEmail(email)) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
        }

        if (isValidDate(date)) {
            System.out.println("Valid date");
        } else {
            System.out.println("Invalid date");
        }
    }
}
