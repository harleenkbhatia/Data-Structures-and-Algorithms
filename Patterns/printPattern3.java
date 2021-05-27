import java.util.*;

public class Main {
    public static void printPattern3(int row) {
        int nst = 1;
        int nsp = row - 1;
        for(int r=1; r<=row; r++) {
            for(int csp=1; csp<=nsp; csp++) {
                System.out.print("\t");

            }

            for(int cst=1; cst<=nst; cst++) {
                System.out.print("*\t");

            }
            nsp--;
            nst++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        printPattern3(row);

        // write ur code here

    }
}