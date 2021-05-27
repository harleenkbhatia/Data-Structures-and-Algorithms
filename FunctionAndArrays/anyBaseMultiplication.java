import java.util.Scanner;

public class anyBaseMultiplication {
    public static Scanner scn= new Scanner(System.in);

      public static long anyBaseAddition(long n, long m, long b){
        long carry = 0, power=1, res=0;
        while(n != 0 || m != 0 || carry != 0){
            long sum=0;
            sum += carry + n % 10 + m % 10;
            n /= 10;
            m /= 10;
            long ld= sum % b;
            carry = sum/b;

            res += ld * power;
            power *= 10;  
        } 
        return res;
    }
    public static long multiplyNumberWithDigit(long n, long d, long b, long power){
        long res=0, carry=0; 
        while(n!=0 || carry != 0){
            long pro= (n%10 * d) + carry;
            n/=10;
            long ld = pro % b;
            carry = pro / b;
            res += ld * power;
            power *= 10;
        }
        return res;
    }
    public static long multiplyTwoNumbers(long b, long n, long m){
        long power=1, res=0;
        while(m != 0){
            long lastDigit = m % 10;
            m /= 10;
            long smallAns = multiplyNumberWithDigit(n, lastDigit, b, power);
            res = anyBaseAddition(res, smallAns, b);
            power *= 10;
        }
        return res;
    }
    public static void main(String[] args){
        long b = scn.nextLong();
        long n1 = scn.nextLong();
        long n2 = scn.nextLong();

        long d = multiplyTwoNumbers(b, n1, n2);
        System.out.println(d);
        
    }

}