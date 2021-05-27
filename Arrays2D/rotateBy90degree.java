import java.util.Arrays;
import java.util.Scanner;

//valid for n=m and n>m combinations only.

public class rotateBy90degree{
    public static Scanner scn = new Scanner(System.in);
    public static void rotateBy90degree(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        //transpose
        for(int i=0; i<n; i++){
            for(int j=i; j<m; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //swapping/Reverse of coloumns
        int j1=0, j2 = m - 1; 
        while(j1<j2){
            for(int i=0; i<n; i++){
                int temp = arr[i][j1];
                arr[i][j1]=arr[i][j2];
                arr[i][j2]=temp;
            }
            j1++;
            j2--;
        }
        display(arr);
    }
    public static void main(String[] args) throws Exception {
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++)
            for(int j=0; j<m; j++){
                arr[i][j] = scn.nextInt();
            
            }
        rotateBy90degree(arr);
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}