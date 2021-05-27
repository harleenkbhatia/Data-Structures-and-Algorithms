import java.util.*;

public class Main {
    public static void pattern5(int row){
        int nsp=row/2;
        int nst=1;
        for(int r=1; r<=row; r++){
            for(int csp=1; csp<=nsp; csp++){
                System.out.print("\t");
                
            }
            for(int cst=1; cst<=nst; cst++){
                System.out.print("*\t");
                
            }
            if(r<=row/2){
                nsp--;
                nst+=2;
                
            }
            else{
                nsp++;
                nst-=2;
            }
            System.out.println();
    }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern5(n);
        // write ur code here

    }
}