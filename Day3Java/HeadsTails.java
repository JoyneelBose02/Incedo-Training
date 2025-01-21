package Day3Java;

import java.util.Random;
import java.util.Scanner;
class Test {
    HeadsTails obj = new HeadsTails();
    String result = obj.getHeadsOrTails();
    public String printResult(){
        return result;
    }
}
public class HeadsTails {
    public String getHeadsOrTails(){
        Random random = new Random();
        return random.nextBoolean() ? "Heads" : "Tails";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a choice: ");
        String choice = input.nextLine();
        HeadsOrTailsGame game = new HeadsOrTailsGame();
        System.out.println(game.playGame(choice));
    }
}
class HeadsOrTailsGame{
    public String playGame(String userInput){
        Test test = new Test();
        boolean val = (test.printResult().equalsIgnoreCase(userInput));
        if(val){
            System.out.println("Computer choice: " + test.printResult());
            System.out.println("Your Choice: " + userInput);
            return "You Win!!";
        }
        return "Computer Choice: " + test.printResult() + " \n Your Choice: " + userInput + "\n You lose!!";
    }
}