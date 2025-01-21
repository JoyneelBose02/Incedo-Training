package Day3Java;

import java.util.HashMap;
import java.util.Scanner;

public class StrangeCalcScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total number of inputs: " );
        int total = input.nextInt();
        double[] inputNumbers = new double[total];
        for(int i = 0; i<total; i++){
            System.out.println("Enter Number " + (i+1) + " : ");
            inputNumbers[i] = input.nextInt();
        }
        StrangeCalc calc = new StrangeCalc(inputNumbers);
        HashMap<String,Double> map = new HashMap<>();
        map.put("add", calc.add());
        map.put("subtract",calc.subtract());
        map.put("multiply",calc.multiply());
        map.put("divide",calc.divide());
        map.put("remainder",calc.remainder());
        map.put("max",calc.max());
        map.put("min",calc.min());
        map.put("average",calc.average());

        String operation;
        while(true){
            System.out.println("Enter the operation: ");
            operation = input.next();
            if(operation.equalsIgnoreCase("end")){
                System.out.println("Program Has ended");
                break;
            }
            System.out.println("Answer: " + map.get(operation) );
        }
        input.close();
    }
}
