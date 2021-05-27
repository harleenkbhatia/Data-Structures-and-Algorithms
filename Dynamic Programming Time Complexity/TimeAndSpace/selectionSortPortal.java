import java.io.*;
import java.util.*;

public class Main {
    /*public static int moveToStart2(int[] arr, int si, int ei) {
      int smallIdx = si;
        for (int i = si + 1; i <= ei; i++){
            if (arr[smallIdx] > arr[i]) smallIdx = i;
        }
        return smallIdx;
    }*/
    
    public static int moveToStart(int[] arr, int si, int ei) {
      int smallIdx = si;
        for (int i = si + 1; i <= ei; i++){
            if (isSmaller(arr,i,smallIdx)) smallIdx=i;
        }
        return smallIdx;
    }
    public static void selectionSort(int arr[]) {
        int n=arr.length;
        int ei = n-1;
        for (int i = 0; i < ei; i++) {
            int idx = moveToStart2(arr, i, ei);
            swap(arr, i,idx);
        }
    }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

// isSmaller iss unnecessary
  // return true if ith element is smaller than jth element
  public static boolean isSmaller(int[] arr, int i, int j) {
    System.out.println("Comparing " + arr[i] + " and " + arr[j]);
    if (arr[i] < arr[j]) {
      return true;
    } else {
      return false;
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
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    selectionSort(arr);
    print(arr);
  }

}