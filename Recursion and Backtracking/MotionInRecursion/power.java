import java.util.Scanner;

public class power {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.print(powerLogarithmic(a,b));
        System.out.print(power(a,b));
        System.out.print(powBtr2(a,b));
    }

    public static int power(int a, int b) {
        return b == 0 ? 1 : a * power(a , b - 1);
    }
    public static int powerLogarithmic(int a, int b) { //O(log base 2 (n)) aayi h best h ye
        if(b==0) return 1;
        int smallAns= powerLogarithmic(a, b / 2);
        smallAns *= smallAns;
        return b % 2 == 0 ? smallAns : a * smallAns;
    }  
    public static int powBtr2(int a, int b) { //not good O(n) aari h 
        if(b==0) return 1;
        int smallAns= powBtr2(a, b / 2) * powBtr2(a, b / 2);
        return b % 0 ? smallAns : a * smallAns;
    }    
}