import java.util.Arrays;
import java.util.Scanner;

public class waveTraversal{
    public static Scanner scn = new Scanner(System.in);
    public static void waveTraversal(int[][] arr){  // waveTraversal_left_right
        int n = arr.length;
        int m = arr[0].length;
        for(int i=0; i<n; i++){
            if(i%2==0){
                for(int j=0; j<m; j++)
                    System.out.println(arr[i][j]);
            }
            else{
                for(int j=m-1; j>=0; j--)
                    System.out.println(arr[i][j]);
            }
        }
    }   
    


    public static void main(String[] args) throws Exception {
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        waveTraversal(arr);
    }
}