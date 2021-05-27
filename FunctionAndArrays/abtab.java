import java.util.*;

public class abtab{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();
        int m = BaseToDecimal(n, b1);
        System.out.println(DecimalToBase(m, b2));
    }

    public static int BaseToDecimal(int n, int b1) {
        int pow = 1, res1 = 0;
        while (n != 0) {
            long lastDigit = n % 10;
            n /= 10;

            res1 += lastDigit * pow;
            pow *= b1;

        }
        return res1;
    }
    public static int DecimalToBase(int r, int b2) {
        int pow = 1, res2 = 0;
        while (r != 0) {
            int rem = r % b2;
            r /= b2;

            res2 += rem * pow;
            pow *= 10;

        }
        return res2;
    }

}