import java.util.Scanner;

public class displayArrayRev {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        displayArrReverse(arr, 0, n);
    }

    public static void displayArrReverse(int[] arr,int idx, int n) {
        if (idx == n) return;

        displayArrReverse(arr, idx + 1, n);
        
        System.out.println(arr[idx]);
    }

}