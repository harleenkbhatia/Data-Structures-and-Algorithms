import java.util.*;

public class Main {
    public static void pattern6(int row){
        int nsp=1;
        int nst=(row+1)/2;
        for(int r=1; r<=row; r++){
            for(int cst=1; cst<=nst; cst++){
                System.out.print("*\t");
                
            }
            for(int csp=1; csp<=nsp; csp++){
                System.out.print("\t");
                
            }
            for(int cst=1; cst<=nst; cst++){
                System.out.print("*\t");
                
            }
            if(r<=row/2){
                nsp+=2;
                nst--;
                
            }
            else{
                nsp-=2;
                nst++;
            }
            System.out.println();
    }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern6(n);
        // write ur code here

    }
}