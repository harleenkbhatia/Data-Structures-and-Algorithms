import java.util.*;

public class invNum {
    public static Scanner scn = new Scanner(System.in);
    public static void invNum(int n) {
        int op = 1;
        int inv = 0;
        while (n != 0) {
            int pow=1;
            int od = n % 10;
            int id = op;
            int ip = od;
            inv = inv + id * (int)Math.pow(10, ip-1);
            n /= 10;
            op++;
        }
        System.out.println(inv);
    }
    public static void main(String[] args) {
        // write your code here
        int n = scn.nextInt();

        invNum(n);
    }
}