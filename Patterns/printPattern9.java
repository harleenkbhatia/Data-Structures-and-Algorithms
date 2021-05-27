import java.util.*;

public class Main {
    public static void printPattern9(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if (i == j || i+j==row+1) {
                    System.out.print("*\t");
                } 
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row= scn.nextInt();
        printPattern9(row);
        // write ur code here

    }
}