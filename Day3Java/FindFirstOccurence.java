package Day3Java;
public class FindFirstOccurence {
    private static int[][] matrix = {
        {1, 7, 3, 9, 5, 3},
        {6, 2, 3},
        {7, 5, 1, 4, 0},
        {1, 0, 2, 9, 6, 3, 7, 8, 4}
    };
    public static void main(String[] args) {
        // Define the matrix

        // Array to store the first occurrence index of numbers from 0 to 9
        // Store as a string with format "row,col" or -1 if not found
        String[] firstOccurrences = new String[10];

        // Initialize the firstOccurrences array with "-1" indicating not found
        for (int i = 0; i < 10; i++) {
            firstOccurrences[i] = "-1";
        }

        // Loop through the matrix to find the first occurrence of each number
        outer:
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int value = matrix[i][j];
                // Only record the first occurrence if it hasn't been found yet
                if (firstOccurrences[value].equals("-1")) {
                    firstOccurrences[value] = i + "," + j;  
                }
                // If all numbers from 0 to 9 have been found, exit early
                if (areAllNumbersFound(firstOccurrences)) {
                    break outer;
                }
            }
        }

        // Output the first occurrence indices of numbers from 0 to 9
        for (int i = 0; i < firstOccurrences.length; i++) {
            if (firstOccurrences[i].equals("-1")) {
                System.out.println("Number " + i + " not found in the matrix.");
            } else {
                System.out.println("First occurrence of number " + i + " is at index " + firstOccurrences[i]);
            }
        }
    }

    // Helper method to check if all numbers from 0 to 9 are found
    private static boolean areAllNumbersFound(String[] firstOccurrences) {
        for (int i = 0; i < firstOccurrences.length; i++) {
            if (firstOccurrences[i].equals("-1")) {
                return false;
            }
        }
        return true;
    }
}
