import java.util.Arrays;
import java.util.Scanner;

public class exitPoint {
    public static Scanner scn = new Scanner(System.in);
    public static void exitPoint(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int r = 0, c = 0, dir = 0;

        while (true) {

            dir = (dir + arr[r][c]) % 4;
            if (dir == 0) {
                c++;
                if (c == m) {
                    System.out.println(r);
                    System.out.println(c - 1);
                    break;
                }
            } else if (dir == 1) {
                r++;
                if (r == n) {
                    System.out.println(r-1);
                    System.out.println(c);
                    break;
                }
            } else if (dir == 2) {
                c--;
                if (c == -1) {
                    System.out.println(r);
                    System.out.println(c + 1);
                    break;
                }
            } else {
                r--;
                if (r == -1) {
                    System.out.println(r+1);
                    System.out.println(c);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        // write your code here

        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        exitPoint(arr);
    }

}