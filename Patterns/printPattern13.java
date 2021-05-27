import java.util.*;
public class Main {
    public static void pattern13(int row){
        for(int n = 0; n < row; n++){
            int nck=1;
            for(int k = 0; k <= n; k++){
                System.out.print(nck+"\t");
                int nckp1 = nck * (n - k) / (k + 1);
                nck=nckp1;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //write your code here
        int n=scn.nextInt();
        pattern13(n);

    }
}