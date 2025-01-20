package Day1Java;
import java.util.Scanner;
public class IsNumPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        int rev = 0;
        int temp = n;
        while(temp > 0){
            int val = temp%10;
            rev = (rev*10) + val;
            temp = temp/10;
        }
        if(rev == n){
            System.out.println(true);
        }
        else{
            System.out.println(true);
        }
        sc.close();
    }
}
