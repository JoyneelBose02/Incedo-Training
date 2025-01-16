import java.util.Scanner;
package Day1Java;
public class printPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        int sum = 0;
        for(int i = 0; i<=n; i++){
            if(isNumPrime(i)){
                total+=1;
                sum+=i;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Sum of prime Numbers till n = " + sum);
        System.out.println("Average of N Prime Numbers: " + (double)sum/total);
    }
    public static boolean isNumPrime(int num){
        if(num <= 1){
            return false;
        }
        for(int i = 2; i*i <= num; i++){
            if(num %i == 0){
                return false;
            }
        }
        return true;
    }
}
