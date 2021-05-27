import java.util.Arrays;
import java.util.Scanner;

public class stateOfWakanda2{
    public static Scanner scn = new Scanner(System.in);
    public static void stateOfWakanda2(int[][] arr){ //waveTraversal_diagonal
        int n = arr.length;
        int m = arr[0].length;
        for(int gap=0; gap<m; gap++){ //think according to rectangle
            for(int i=0, j=gap; i<n && j<m; i++,j++){
                System.out.println(arr[i][j]);
            }
        }
    }   
    


    public static void main(String[] args) throws Exception {
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++)
            for(int j=0; j<m; j++){
                arr[i][j] = scn.nextInt();
            
            }
        stateOfWakanda2(arr);
    }
}    