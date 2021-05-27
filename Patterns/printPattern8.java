import java.util.*;

public class Main {
    public static void printPattern8(int row) {
        for(int i = 1; i <= row; i++) {
            for(int j=1; j<=row; j++){//for(int j = row; j>=1; j--) {
                if(i == j) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        printPattern8(row);
        // write ur code here

    }
}