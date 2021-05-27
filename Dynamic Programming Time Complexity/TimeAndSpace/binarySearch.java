import java.util.Scanner;
import java.util.Arrays;

public class binarySearch {

    public static int binarySearch(int[] arr, int data, int si, int ei) {
        
        while(si <= ei){
            int mid = (si + ei) / 2;
            if(arr[mid] == data) return mid;
            else if(arr[mid] > data) ei = mid - 1;
            else si = mid + 1;
        }
        return -1; //iska significance bht h but baad m btayenge
    }
    public static int nearestEle(int[] arr, int data, int si, int ei){
        if(data > arr[ei]) return arr[ei];
        else if(data < arr[si]) return arr[si];

        while(si <= ei){
            int mid = (si + ei) / 2;
            if(arr[mid] == data) return mid;
            else if(arr[mid] > data) ei = mid - 1;
            else si = mid + 1;
        }
        return arr[si] - data < data - arr[ei] ? arr[si] : arr[ei];
    }
    
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int data = scn.nextInt();
        System.out.println(binarySearch(arr, data, 0, arr.length - 1));
    }

}