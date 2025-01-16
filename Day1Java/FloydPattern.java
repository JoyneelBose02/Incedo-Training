package Day1Java;
public class FloydPattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows
        int num = 1;  // Starting number

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++; // Increment the number
            }
            System.out.println(); // Move to the next line
        }
    }
}

