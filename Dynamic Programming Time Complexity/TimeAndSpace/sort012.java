import java.io.*;
import java.util.*;

public class Main {

    public static void sort012(int[] arr) {
        
        int n = arr.length;
        int pt = 0, pt2 = n - 1, itr = 0;
        while(itr <= pt2){
            if(arr[itr] == 0)
                swap(arr, itr++, pt++);
            else if(arr[itr] == 2)
                swap(arr, itr, pt2--);
            else itr++;
        }

    }

    // used for swapping ith and jth elements of array
    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping index " + i + " and index " + j);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        sort012(arr);
        print(arr);
    }

}