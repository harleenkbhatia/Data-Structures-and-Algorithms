import java.util.Scanner;
import java.util.Arrays;

public class brokenEconomy {

    public static void brokenEconomy(int[] arr, int data, int si, int ei){
        
        if(data > arr[ei]) { 
            System.out.println(arr[ei]);
            System.out.println(arr[ei - 1]);
            return;
        }
        else if(data < arr[si]){
            System.out.println(arr[si]);
            System.out.println(arr[si + 1]);
            return;
        }

        while(si <= ei){
            int mid = (si + ei) / 2;
            if(arr[mid] == data){
                System.out.print(arr[mid]);
                return;
            } 
            else if(arr[mid] > data) ei = mid - 1;
            else si = mid + 1;
        }
        
        System.out.println(arr[si]);
        System.out.println(arr[ei]);
        
    }
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int data = scn.nextInt();
        brokenEconomy(arr, data, 0, arr.length - 1);
    }

}