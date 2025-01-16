import java.util.Scanner;
package Day1Java;
public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isNumPrime(n)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
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
