import java.util.Arrays;
import java.util.Scanner;

public class spanArray{
    public static Scanner scn = new Scanner(System.in);
    
    public static int spanArray(int[] arr){
        int maxEle= -(int)1e9;
        int minEle= (int)1e9;
        int span=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > maxEle) maxEle=arr[i];
            if(arr[i] < minEle) minEle=arr[i];
            
            span = maxEle - minEle;
        }
        return span;
    }
    public static void main(String[] args) throws Exception {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;  i++){
            arr[i] = scn.nextInt();
        }
        System.out.print(spanArray(arr));       
    }
}