package Day3Java;
import java.util.*;
public class SimpleCalcScanner {

    public static void main(String[] args) {
        SimpleCalc calc = new SimpleCalc();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int num1 = input.nextInt();
        System.out.println("Enter Second Number: ");
        int num2 = input.nextInt();
        HashMap<String,Integer> map = new HashMap<>();
        map.put("add", calc.add(num1, num2));
        map.put("subtract",calc.subtract(num1, num2));
        map.put("multiply",calc.multiply(num1, num2));
        map.put("divide",calc.divide(num1, num2));
        map.put("remainder",calc.remainder(num1, num2));
        map.put("max",calc.max(num1, num2));
        map.put("min",calc.min(num1, num2));
        map.put("average",calc.average(num1, num2));

        String operation ="";
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
