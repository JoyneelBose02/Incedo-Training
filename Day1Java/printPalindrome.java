import java.util.Scanner;
package Day1Java;
public class printPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            if(isNumPalindrome(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isNumPalindrome(int n){
        int rev = 0;
        int temp = n;
        while(temp > 0){
            int val = temp%10;
            rev = (rev*10) + val;
            temp = temp/10;
        }
        if(rev == n){
            return true;
        }
        return false;
    }
}
