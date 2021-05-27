import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void targetSumPair1(int[] arr, int data, int si, int ei){
        Arrays.sort(arr);
        while(si < ei){
            int sum = arr[si] + arr[ei];
            if(sum > data) ei--;
            else if(sum < data) si++;
            else {
                System.out.println(arr[si]+", "+arr[ei]);
                si++;
                ei--;
            }
        }
        
    }
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        targetSumPair1(arr, target, 0, arr.length - 1);
    }

}