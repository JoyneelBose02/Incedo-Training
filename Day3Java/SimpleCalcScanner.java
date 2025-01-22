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
// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class Calculator extends JFrame implements ActionListener {
//     // Declare components
//     private JTextField textField;
//     private String operator;
//     private double num1, num2, result;

//     public Calculator() {
//         // Frame settings
//         setTitle("Simple Calculator");
//         setSize(400, 600);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLocationRelativeTo(null);
//         setLayout(new BorderLayout());

//         // Text field to display result
//         textField = new JTextField();
//         textField.setFont(new Font("Arial", Font.PLAIN, 30));
//         textField.setEditable(false);
//         add(textField, BorderLayout.NORTH);

//         // Panel to hold buttons
//         JPanel panel = new JPanel();
//         panel.setLayout(new GridLayout(4, 4, 10, 10));

//         // Button labels
//         String[] buttons = {
//             "7", "8", "9", "/",
//             "4", "5", "6", "*",
//             "1", "2", "3", "-",
//             "0", ".", "=", "+"
//         };

//         // Add buttons to the panel
//         for (String text : buttons) {
//             JButton button = new JButton(text);
//             button.setFont(new Font("Arial", Font.PLAIN, 30));
//             button.addActionListener(this);
//             panel.add(button);
//         }

//         // Add panel to frame
//         add(panel, BorderLayout.CENTER);
//     }

//     @Override
//     public void actionPerformed(ActionEvent e) {
//         String command = e.getActionCommand();

//         if (command.charAt(0) == '=') {
//             // Calculate result
//             num2 = Double.parseDouble(textField.getText());
//             switch (operator) {
//                 case "+":
//                     result = num1 + num2;
//                     break;
//                 case "-":
//                     result = num1 - num2;
//                     break;
//                 case "*":
//                     result = num1 * num2;
//                     break;
//                 case "/":
//                     if (num2 != 0) {
//                         result = num1 / num2;
//                     } else {
//                         textField.setText("Error");
//                         return;
//                     }
//                     break;
//             }
//             textField.setText(String.valueOf(result));
//             operator = "=";
//         } else if (command.charAt(0) == 'C') {
//             // Clear the screen
//             textField.setText("");
//             num1 = num2 = result = 0;
//             operator = "";
//         } else if ("0123456789".indexOf(command) >= 0) {
//             // Append digits to the text field
//             textField.setText(textField.getText() + command);
//         } else {
//             // Set the operator for future operations
//             if (!textField.getText().isEmpty()) {
//                 num1 = Double.parseDouble(textField.getText());
//             }
//             operator = command;
//             textField.setText("");
//         }
//     }

//     public static void main(String[] args) {
//         // Create and show the calculator GUI
//         SwingUtilities.invokeLater(() -> {
//             Calculator calculator = new Calculator();
//             calculator.setVisible(true);
//         });
//     }
// }
