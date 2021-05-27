import java.util.*;

public class Main {
    public static void pattern20(int row){
        int p = (row + 1) / 2;
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= row; j++){
                if(j == 1 || j == row) System.out.print("*\t");
                else if(i > row / 2 && (i == j || i + j == row + 1)){
                    System.out.print("*\t");
                }
                else System.out.print("\t");
            }
            
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row= scn.nextInt();
        pattern20(row);
        // write ur code here

    }
}