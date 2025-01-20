
package Day1Java;
public class PrintArmstrong {
    public static void main(String[] args) {
        for(int i = 1; i<= 1000; i++){
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isArmstrong(int n){
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
            return true;
        }
        else{
            return false;
        }
    }
}
