package Day1Java;

import java.util.regex.*;
import java.util.Scanner;


public class InputValidator {

    // Method to validate name (alphanumeric + spaces)
    public static boolean isValidName(String name) {
        // Regular expression for alphanumeric characters and spaces
        String regex = "^[a-zA-Z0-9 ]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    // Method to validate email (must end with @gmail.com)
    public static boolean isValidEmail(String email) {
        // Regular expression for email validation (checking if it ends with @gmail.com)
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@gmail\\.com$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    // Method to validate date (dd MM yyyy format) using regex
    public static boolean isValidDate(String date) {
        // Regular expression for validating a date in dd MM yyyy format
        String regex = "^(0[1-9]|[12][0-9]|3[01]) (0[1-9]|1[0-2]) (19|20)\\d\\d$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date);
        
        // If it doesn't match the regex pattern, it's invalid
        if (!matcher.matches()) {
            return false;
        }

        // Further check for the correct number of days in each month
        String[] parts = date.split(" ");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        // Days in each month for the given year
        int[] daysInMonth = {31, (isLeapYear(year) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Check if the day is within the valid range for the given month
        return day <= daysInMonth[month - 1];
    }

    // Helper method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap year logic: A year is a leap year if divisible by 4, except years divisible by 100, unless divisible by 400
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Validate name input
        String name;
        while (true) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
            if (isValidName(name)) {
                System.out.println("Valid name.");
                break;  // Exit the loop when the name is valid
            } else {
                System.out.println("Invalid name. Name must be alphanumeric and can include spaces.");
            }
        }

        // Validate email input
        String email;
        while (true) {
            System.out.print("Enter your email: ");
            email = scanner.nextLine();
            if (isValidEmail(email)) {
                System.out.println("Valid email.");
                break;  // Exit the loop when the email is valid
            } else {
                System.out.println("Invalid email. Email must end with @gmail.com.");
            }
        }

        // Validate date input
        String date;
        while (true) {
            System.out.print("Enter your date (dd MM yyyy): ");
            date = scanner.nextLine();
            if (isValidDate(date)) {
                System.out.println("Valid date.");
                break;  // Exit the loop when the date is valid
            } else {
                System.out.println("Invalid date. Please use the format dd MM yyyy and ensure it's a valid date.");
            }
        }

        scanner.close();
    }
}

