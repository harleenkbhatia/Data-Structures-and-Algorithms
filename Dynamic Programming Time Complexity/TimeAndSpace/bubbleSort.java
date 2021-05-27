import java.util.Scanner;

public class Main {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void moveToLast(int[] arr, int si, int ei) {
        for (int i = si + 1; i <= ei; i++){
            if (arr[i - 1] > arr[i]) swap(arr, i - 1, i);
        }
    }
    public static void bubble(int arr[], int n) {
        int ei = n-1;
        for (int i = 0; i < n; i++) {
            moveToLast(arr, 0, ei - i);
        }
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = s.nextInt();
        }

        bubble(ar, n);
        for (int val: ar)
            System.out.print(val + " ");
    }

}