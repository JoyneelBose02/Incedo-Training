package Day3Java;

import java.util.*;

public class WordModerator {
    public static void main(String[] args) {
        // Censored words list (you can add more words to this list)
        Set<String> censoredWords = new HashSet<>(Arrays.asList( "evil", "offensive", "bad", "trash"));
        
        // Create a scanner object to read input from the keyboard
        Scanner inputScanner = new Scanner(System.in);

        String input;

        // Continuously ask for input until the word "end" is entered
        while (true) {
            // Read input from the user
            System.out.println("Please enter a sentence (type 'end' to quit):");
            input = inputScanner.nextLine();
            
            // If the input is "end", break the loop and end the program
            if (input.equalsIgnoreCase("end")) {
                System.out.println("Program has ended.");
                break;
            }
            
            // Process the input to censor any unwanted words
            String[] words = input.split("\\s+");
            StringBuilder processedInput = new StringBuilder();
            
            for (String word : words) {
                // Check if the word is in the censored words set
                if (censoredWords.contains(word.toLowerCase())) {
                    // Replace the censored word with ***
                    processedInput.append("***").append(" ");
                } else {
                    // Otherwise, keep the word as is
                    processedInput.append(word).append(" ");
                }
            }

            // Display the censored sentence
            System.out.println("Moderated sentence: " + processedInput.toString().trim());
        }

        // Close the scanner when done
        inputScanner.close();
    }
}