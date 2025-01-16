import java.util.*;
package Day1Java;
public class isArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int numDigit = 0;
        int sumDigit = 0;
        int temp = n;
        while(temp > 0){
            numDigit += 1;
            temp = temp/10;
        }
        temp = n;
        while(temp > 0){
            int prod = (int)Math.pow(temp%10, numDigit);
            sumDigit += prod;
            temp = temp/10;
        }
        if(sumDigit == n){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

    }
}
