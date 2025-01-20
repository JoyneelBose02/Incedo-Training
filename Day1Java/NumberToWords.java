package Day1Java;
import java.text.DecimalFormat;

public class NumberToWords {
    
    // Arrays to represent number to word conversions for individual digits, tens, and places
    private static final String[] ones = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", 
                                           "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", 
                                           "Seventeen", "Eighteen", "Nineteen" };
    
    private static final String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
    
    private static final String[] thousands = { "", "Thousand", "Million", "Billion", "Trillion" };

    public static String convertToWords(long num) {
        // If the number is zero, return "Zero"
        if (num == 0) {
            return "Zero";
        }
        
        StringBuilder words = new StringBuilder();
        int place = 0;  // To keep track of the place (Thousand, Million, etc.)
        
        while (num > 0) {
            if (num % 1000 != 0) {
                words.insert(0, convertHundreds((int) (num % 1000)) + thousands[place] + " ");
            }
            num /= 1000;
            place++;
        }
        
        return words.toString().trim(); // Remove leading/trailing spaces
    }

    // Convert numbers less than 1000 to words
    private static String convertHundreds(int num) {
        StringBuilder result = new StringBuilder();

        if (num >= 100) {
            result.append(ones[num / 100]).append(" Hundred ");
            num %= 100;
        }

        if (num >= 20) {
            result.append(tens[num / 10]).append(" ");
            num %= 10;
        }

        if (num > 0) {
            result.append(ones[num]).append(" ");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Test cases
        long[] testNumbers = { 123, 12345, 1234567, 987654321, 1000000000, 0, 99 };

        for (long number : testNumbers) {
            System.out.println(number + " in words: " + convertToWords(number));
        }
    }
}

