import java.util.Scanner;

public class displayArray {
    public static void displayArray(int[] arr, int idx, int n) {
        if (idx == n) return;

        System.out.println(arr[idx]);

        displayArray(arr, idx + 1, n);
    }
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        displayArray(arr, 0, n);
    }
}