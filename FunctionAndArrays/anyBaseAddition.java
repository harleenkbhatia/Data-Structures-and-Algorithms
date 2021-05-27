import java.util.Scanner;

public class anyBaseAddition{
    public static Scanner scn= new Scanner(System.in);
    public static long binaryAddition(long n, long m, long b){
        long carry = 0, pow=1, res=0;
        while(n != 0 || m != 0 || carry != 0){
            long sum=0;
            sum += carry + n % 10 + m % 10;
            n /= 10;
            m /= 10;
            long ld= sum % b;
            carry = sum/b;

            res += ld * pow;
            pow *= 10;  
        } 
        return res;
    }
    public static void main(String[] args){
        long n = scn.nextLong();
        long m = scn.nextLong();
        long b = scn.nextLong();
        System.out.print(anyBaseAddition(n,m,b));
    }
}