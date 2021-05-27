import java.util.Scanner;

public class anyBaseSubtraction{
    public static Scanner scn= new Scanner(System.in);
    public static long binarySubtraction(long n, long m, long b){
        //m>n
        long pow=1, borrow=0, res=0;
        while(n != 0 || m != 0){
            long sub=0;
            sub = (m % 10 + borrow) - n % 10;
            n /= 10;
            m /= 10;
            if(sub < 0){
                sub += b;
                borrow = -1;
            }else{
                borrow=0;
            } 
            
            res += sub * pow;
            pow *= 10;
        } 
        return res;
    }
    public static void main(String[] args){
        long n = scn.nextLong();
        long m = scn.nextLong();
        long b = scn.nextLong();
        System.out.println(binarySubtraction(n,m,b));
    }
}