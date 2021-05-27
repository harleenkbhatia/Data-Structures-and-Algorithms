import java.util.Scanner;
import java.util.Arrays;

public class forEachLoop{
    public static Scanner scn = new Scanner(System.in);

    public static void forEachLoop(int[][]arr){
        for (int[] ar : arr) { //for 2D with this statement we get arr[0] ka address 
            for(int a : ar){
                //for 1D for(int val : arr){ System.out.print(val+"\t"); }
                System.out.print(a+" ");
            }
        System.out.println();
        }
    }
    
    public static void main(String[] args) throws Exception {
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0; i<n;  i++){
            for(int j=0; j<m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        forEachLoop(arr);
        
    }

}