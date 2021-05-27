import java.util.*;

public class Main {
    public static void pattern16(int row) {
        int nst = 1, nsp = (row*2) - 3;
        int val=1;
        for (int r = 1; r <= row; r++) {
            
            for (int cst = 1; cst <= nst; cst++) {
                
                System.out.print(val+"\t");
                val++;
            }
            for (int csp = 1; csp <= nsp; csp++) {

                System.out.print("\t");
            }
            if(r==row) {
                nst-- ; 
                val-- ;    
            }
            for (int cst = 1; cst <= nst; cst++) {
                val--;
                System.out.print(val+"\t");

            }

            nst++;
            nsp -= 2;

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // write ur code here
        pattern16(n);
    }
}