import java.util.*;

public class Main {
    public static void printPattern7(int row) {
        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= row; j++) {
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
        printPattern7(row);
        // write ur code here

    }
}