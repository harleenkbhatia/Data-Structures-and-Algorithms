import java.util.*;

public class Main {
    public static void printPattern9(int row) {
        int p = row / 2;
        for (int i = 1; i <= p; i++) {
            for (int j = 1; j <= row; j++) {
                if (i == j || i + j == row + 1 || i==1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        int nsp=row/2, nst=1, q=(row+1)/2;
        for(int r=1; r<=q; r++){
            
            for(int csp=1; csp<=nsp; csp++){
                System.out.print("\t");
            }
            for(int cst=1; cst<=nst; cst++){
                System.out.print("*\t");
            }
            nst+=2;
            nsp--;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        printPattern9(row);
        // write ur code here

    }
}