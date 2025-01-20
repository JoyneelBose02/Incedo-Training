package Day1Java;
import java.util.Scanner;
public class NumberToWords {
    public static void main(String[] args) {
        String[] arr = {"Zero", "One", "Two", "Three", "Four","Five", "Six", "Seven", "Eight", "Nine"};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String output = "";
        while(n>0){
            output = arr[n%10] + output;
            n = n/10;
        }
        System.out.println(output);
    }
}
