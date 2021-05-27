import java.io.*;
import java.util.*;

public class Main {

    public static Scanner scn = new Scanner(System.in);

    public static void saddlePoint(int[][] arr) {

        int n = arr.length;
        int m = arr[0].length;
        //min element in row
        for (int r = 0; r < n; r++) {
            int c = 0;
            int minEle = (int) 1e9;
            for (int j = 0; j < m; j++) {
                if (arr[r][j] < minEle) {
                    minEle = arr[r][j];
                    c = j;
                }
            }
            //assuming minEle to be saddle point
            boolean isSaddlePoint = true;
            //trying to prove our assumption wrong
            for (int i = 0; i < n; i++) {
                if (arr[i][c] > minEle) {
                    isSaddlePoint = false;
                    break;
                }
            }
            //if asumption right print n leave
            if (isSaddlePoint) {
                System.out.println(minEle);
                return;
            }
        }

        System.out.print("Invalid input");
    }
    public static void main(String[] args) throws Exception {
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        saddlePoint(arr);
    }
}