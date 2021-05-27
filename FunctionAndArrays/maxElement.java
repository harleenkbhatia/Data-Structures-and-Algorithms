import java.util.Arrays;
import java.util.Scanner;

public class maxElement{
    public static Scanner scn = new Scanner(System.in);
    public static int maxElement(int[] arr){
        int maxEle= -(int)1e9;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > maxEle) maxEle=arr[i];
        }
        return maxEle;
    }
    
    public static void main(String[] args) throws Exception {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;  i++){
            arr[i] = scn.nextInt();
        }
        int a = maxElement(arr);
        
        System.out.print(a);       
    }
}