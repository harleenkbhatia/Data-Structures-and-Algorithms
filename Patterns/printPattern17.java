import java.util.*;

public class Main {
    public static void pattern17(int row) {
        int nst = 1 , nsp = row / 2, p=(row+1)/2;
        for (int r = 1; r <= row; r++) {
            for(int csp=1; csp<=nsp; csp++){
                if(r==p) System.out.print("*\t");
                else System.out.print("\t");
                
            }
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            if(r < p) nst++;
            else nst--;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        // write ur code here
        pattern17(row);

    }
}