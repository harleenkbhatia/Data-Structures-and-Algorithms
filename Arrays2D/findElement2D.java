import java.util.Scanner;
import java.util.Arrays;

public class minElement{
    Scanner scn=new Scanner(System.in);
    public static boolean findData2D(int[][] arr, int data) {
        for (int[] ar : arr) 
            for(int a : ar)
                if (a == data)
                    return true;
        return false;
    }
    

    public static void main(String[] args) throws Exception {
                
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        int[][] arr= new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
            arr[i][j]= scn.nextInt();
            }
        }
        
        int data = scn.nextInt();
        
        System.out.print(findData2D(arr, data));

    }

}