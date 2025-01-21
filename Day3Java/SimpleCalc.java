package Day3Java;


public class SimpleCalc {
    //Method for addition
    public int add(int num1, int num2){
        return num1 + num2;
    }
    //Method for subtraction
    public int subtract(int num1, int num2){
        return num2 - num1;
    }
    //Method for Multiplication
    public int multiply(int num1, int num2){
        return num1*num2;
    }
    //Method for division
    public int divide(int num1, int num2){
        return num1/num2;
    }
    //Method to find remainder
    public int remainder(int num1, int num2){
        return num1%num2;
    }
    //Method to find the max out of two numbers
    public int max(int num1, int num2){
        return Math.max(num1,num2);
    }
    //Method to find the min out of two numbers
    public int min(int num1, int num2){
        return Math.min(num1, num2);
    }
    //Method to return the average of the two numbers
    public int average(int num1, int num2){
        return (num1 + num2)/2;
    }

    public static void main(String[] args) {
        SimpleCalc obj = new SimpleCalc();
        System.out.println("Addition: " + obj.add(5,6));
        System.out.println("Subtraction: " + obj.subtract(5, 6));
        System.out.println("Multiplication: " + obj.multiply(5, 6));
        System.out.println("Division: " + obj.divide(5, 6));
        System.out.println("Remainder: " + obj.remainder(5, 6));
        System.out.println("Max Number: " + obj.max(5, 6));
        System.out.println("Min Number: " + obj.min(5, 6));
        System.out.println("Average of the numbers: " + obj.average(5, 6));

    }
}
