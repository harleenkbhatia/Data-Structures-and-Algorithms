import java.util.*;

public class Main {
    public static void pattern15(int row) {
        int nsp = row / 2;
        int nd = 1;
        int val = 1;

        for (int r = 1; r <= row; r++) {
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");

            }

            for (int cd = 1; cd <= nd; cd++) {
                System.out.print(val + "\t");
                if(cd<=nd/2) val++;
                else val--;

                }
            if (r <= row / 2) {
                nsp--;
                nd += 2;
                val = r + 1;

            } else {
                nsp++;
                nd -= 2;
                val = row - r;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        pattern15(n);

    }
}