import java.util.*;

public class Main {
    public static void printPattern11(int row) {
        int nst = 1;
        int val=1;
        for (int r = 1; r <= row; r++) {
            for (int cst = 1; cst <= nst; cst++) {
                
                System.out.print(val+"\t");
                val++;
            }
            
            nst++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        printPattern11(row);

        // write ur code here

    }
}