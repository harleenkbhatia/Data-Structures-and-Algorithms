import java.util.Scanner;

public class Main {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void moveToStart(int[] arr, int si, int ei) {
        for (int i = si + 1; i <= ei; i++){
            if (arr[i] < arr[si]) swap(arr, si, i);
        }
    }
    public static void selectionSort(int arr[], int n) {
        int ei = n-1;
        for (int i = 0; i < ei; i++) {
            moveToStart(arr, i,ei);
        }
    }
    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = s.nextInt();
        }

        selectionSort(ar, n);
        for (int val: ar)
            System.out.print(val + " ");
    }

}