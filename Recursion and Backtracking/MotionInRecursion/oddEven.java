import java.util.Scanner;

public class oddEven {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pdi(n);
    }

    public static void pdi(int n) {
        if (n <= 1) return;

        if(n%2 != 0) System.out.println(n); //upr jate hue odd nos

        pdi(n - 1);
        
        if(n%2 == 0) System.out.println(n); //niche aate hue even nos
    }

    
}