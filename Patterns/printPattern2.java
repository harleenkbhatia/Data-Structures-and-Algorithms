import java.util.*;

public class Main {
    public static void printPattern2(int row) {
        int nst = row;
        for (int r = 1; r <= row; r++) {
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            nst--;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        printPattern(row);

        // write ur code here

    }
}