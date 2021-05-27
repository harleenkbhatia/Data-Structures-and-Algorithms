import java.util.Scanner;
import java.util.Arrays;

public class maxElement2D{
    public static Scanner scn = new Scanner(System.in);
    
    public static int maxElement(int[][] arr){
        int maxEle= (int)1e9;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] > maxEle) maxEle=arr[i][j];
                //maxEle= Math.max(maxEle, arr[i][j]);
            }
        }
        return maxEle;
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
        
        int b = maxElement(arr);
       
        System.out.print(b);       
    }
}