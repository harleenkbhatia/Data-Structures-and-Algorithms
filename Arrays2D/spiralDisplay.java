import java.util.Arrays;
import java.util.Scanner;

public class spiralDisplay{
    public static Scanner scn = new Scanner(System.in);
    public static void spiralDisplay(int[][] arr){
        int n=arr.length;
        int m= arr[0].length;
        int rmin=0, cmin=0, rmax=n-1, cmax=m-1;
        int tne=n*m; // total no. of elements
        while(tne > 0){
            for(int i=rmin; i<=rmax && tne>0; i++){
                tne--;
                System.out.println(arr[i][cmin]);
            }
            cmin++;
            for(int i=cmin; i<=cmax && tne>0; i++){
                tne--;
                System.out.println(arr[rmax][i]);
            }
            rmax--;
            for(int i=rmax; i>=rmin && tne>0; i--){
                tne--;
                System.out.println(arr[i][cmax]);
            }
            cmax--;
            for(int i=cmax; i>=cmin && tne>0; i--){
                tne--;
                System.out.println(arr[rmin][i]);
            }
            rmin++;
        }
        
    }

    public static void main(String[] args) throws Exception {
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        spiralDisplay(arr);
    }

}