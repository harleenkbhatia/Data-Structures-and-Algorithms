import java.io.*;
import java.util.*;

public class Main {

    public static void sumOfTwoArrays(int[] arr1, int[] arr2) {

        int p = arr1.length, q = arr2.length;
        int r = Math.max(p, q) + 1;
        int[] ans = new int[r];
        int carry = 0, i = p - 1, j = q - 1, k = r - 1;

        while (k >= 0) {

            //int sum = carry;

            //if (i >= 0) sum += arr1[i--];

            //if (j >= 0) sum += arr2[j--];

            int sum = carry + (i >= 0 ? arr1[i--] : 0) + (j >= 0 ? arr2[j--] : 0);
            /* ? ternary operator
             syntax: condition ? s1 : s2 
            if condition is True s1 will occur and if condition if False s2 will occur*/
            ans[k--] = sum % 10;

            if (sum >= 10) carry = 1;

            else carry = 0;
        }

        for (int l = 0; l < ans.length; l++) {
            if (l == 0 && ans[l] == 0) continue;
            System.out.println(ans[l]);
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int len1 = scn.nextInt();
        int[] arr1 = new int[len1];
        for (int i = 0; i < len1; i++) {
            arr1[i] = scn.nextInt();

        }
        int len2 = scn.nextInt();
        int[] arr2 = new int[len2];
        for (int j = 0; j < len2; j++) {
            arr2[j] = scn.nextInt();

        }
        sumOfTwoArrays(arr1, arr2);

    }

}