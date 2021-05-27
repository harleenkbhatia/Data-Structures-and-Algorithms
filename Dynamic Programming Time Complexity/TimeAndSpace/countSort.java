import java.io.*;
import java.util.*;

public class Main {

    public static void countSort(int[] arr, int min, int max) {
        int[] freqArray = new int[max - min + 1];
        for( int ele : arr)
            freqArray[ele - min]++;
        int itr = 0;
        for(int i = 0; i < freqArray.length; i++){
            int freq = freqArray[i];
            while(freq --> 0)
                arr[itr++] = i + min;
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        countSort(arr, min, max);
        print(arr);
    }

}