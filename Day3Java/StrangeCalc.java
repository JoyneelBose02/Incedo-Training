package Day3Java;

public class StrangeCalc {
    private double[] values;

    // Constructor that accepts an undefined number of parameters
    public StrangeCalc(double... values) {
        this.values = values;
    }

    // Add all values
    public double add() {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum;
    }

    // Subtract all values sequentially
    public double subtract() {
        if (values.length < 2) {
            throw new IllegalArgumentException("At least two numbers are required for subtraction.");
        }
        double result = values[0];
        for (int i = 1; i < values.length; i++) {
            result -= values[i];
        }
        return result;
    }

    // Multiply all values
    public double multiply() {
        double result = 1;
        for (double value : values) {
            result *= value;
        }
        return result;
    }

    // Divide sequentially
    public double divide() {
        if (values.length < 2) {
            throw new IllegalArgumentException("At least two numbers are required for division.");
        }
        double result = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            result /= values[i];
        }
        return result;
    }

    // Calculate remainder (mod) sequentially
    public double remainder() {
        if (values.length < 2) {
            throw new IllegalArgumentException("At least two numbers are required for remainder operation.");
        }
        double result = values[0];
        for (int i = 1; i < values.length; i++) {
            result %= values[i];
        }
        return result;
    }

    // Find the maximum value
    public double max() {
        double max = values[0];
        for (double value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    // Find the minimum value
    public double min() {
        double min = values[0];
        for (double value : values) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    // Calculate the average
    public double average() {
        if (values.length == 0) {
            throw new IllegalArgumentException("At least one number is required to calculate the average.");
        }
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.length;
    }

    // Example usage in the main method
    public static void main(String[] args) {
        StrangeCalc calc = new StrangeCalc(10, 5, 3);

        System.out.println("Add: " + calc.add());
        System.out.println("Subtract: " + calc.subtract());
        System.out.println("Multiply: " + calc.multiply());
        System.out.println("Divide: " + calc.divide());
        System.out.println("Remainder: " + calc.remainder());
        System.out.println("Max: " + calc.max());
        System.out.println("Min: " + calc.min());
        System.out.println("Average: " + calc.average());
    }
}
