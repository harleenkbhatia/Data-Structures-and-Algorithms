import java.util.Scanner;

public class abtd {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        long b = scn.nextLong();
        long b1= scn.nextLong();
        long d = getValueIndecimal(n, b);
        System.out.println(d);
        System.out.println(b1);
    }

    public static long getValueIndecimal(long n, long b) {
        long pow = 1, res = 0;
        while (n != 0) {
            long lastDigit = n % 10;
            n /= 10;

            res += lastDigit * pow;
            pow *= b;

        }
        return res;
    }

}