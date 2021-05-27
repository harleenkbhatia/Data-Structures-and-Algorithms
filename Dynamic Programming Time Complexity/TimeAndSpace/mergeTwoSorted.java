import java.io.*;
import java.util.*;

public class Main {

    public static int[] mergeTwoSortedArrays(int[] A, int[] B) {
        if(A.length == 0 || B.length == 0)
            return A.length == 0 ? B : A;
            
        int n = A.length;
        int m = B.length;
        int[] ans = new int[n+m];
        
        int i = 0, j = 0, k = 0;
        while(i < n && j < m){
            if(A[i] < B[j])
                ans[k++] = A[i++];
            else 
                ans[k++] = B[j++];
        }
        while(i < n)
            ans[k++] = A[i++];
        while(j < m)
            ans[k++] = B[j++];
        return ans;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scn.nextInt();
        }
        int[] mergedArray = mergeTwoSortedArrays(a, b);
        print(mergedArray);
    }

}