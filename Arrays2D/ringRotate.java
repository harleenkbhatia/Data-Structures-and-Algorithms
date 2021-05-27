import java.io.*;
import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);

    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    public static void rotate(int[] arr, int k) {
        // write your code here
        int n = arr.length;
        k = (k % n + n) % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    public static int[] fillOnedFromShell(int[][] arr, int s) {
        int rmin = s - 1, cmin = s - 1;
        int rmax = arr.length - s;
        int cmax = arr[0].length - s;
        int sz = 2 * (rmax - rmin + cmax - cmin);

        int[] oned = new int[sz];

        int idx = 0;

        int tne = sz; // total no. of elements

        while (tne > 0) {
            //lw
            for (int i = rmin; i <= rmax && tne > 0; i++) {
                tne--;
                oned[idx] = arr[i][cmin];
                idx++;
            }
            //bw
            for (int i = cmin+1; i <= cmax && tne > 0; i++) {
                tne--;
                oned[idx] = arr[rmax][i];
                idx++;
            }
            //rw
            for (int i = rmax-1; i >= rmin && tne > 0; i--) {
                tne--;
                oned[idx] = arr[i][cmax];
                idx++;
            }
            //tw
            for (int i = cmax-1; i >= cmin+1 && tne > 0; i--) {
                tne--;
                oned[idx] = arr[rmin][i];
                idx++;
            }

        }
        return oned;
    }

    public static void fillShellFromOned(int[][] arr, int s, int[] oned) {
        int rmin = s - 1, cmin = s - 1;
        int rmax = arr.length - s;
        int cmax = arr[0].length - s;
        int sz = 2 * (rmax - rmin + cmax - cmin);
        int idx = 0;

        int tne = sz; // total no. of elements

        while (tne > 0) {
            //lw
            for (int i = rmin; i <= rmax && tne > 0; i++) {
                tne--;
                 arr[i][cmin]=oned[idx];
                idx++;
            }
            //bw
            for (int i = cmin+1; i <= cmax && tne > 0; i++) {
                tne--;
                 arr[rmax][i]=oned[idx];
                idx++;
            }
            //rw
            for (int i = rmax-1; i >= rmin && tne > 0; i--) {
                tne--;
                arr[i][cmax]=oned[idx];
                idx++;
            }
            //tw
            for (int i = cmax-1; i >= cmin+1 && tne > 0; i--) {
                tne--;
                arr[rmin][i]=oned[idx];
                idx++;
            }

        }

    }
    public static void rotateShell(int[][] arr, int s, int r) {
        int[] oned = fillOnedFromShell(arr, s);
        rotate(oned, r);
        fillShellFromOned(arr, s, oned);
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
        int s = scn.nextInt();
        int r = scn.nextInt();
        rotateShell(arr, s, r);
        display(arr);
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