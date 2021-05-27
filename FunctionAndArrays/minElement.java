import java.util.Arrays;
import java.util.Scanner;

public class minElement{
    public static Scanner scn = new Scanner(System.in);
    
    public static int minElement(int[] arr){
        int minEle= (int)1e9;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < minEle) minEle=arr[i];
        }
        return minEle;
    }
    public static void main(String[] args) throws Exception {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;  i++){
            arr[i] = scn.nextInt();
        }
        
        int b = minElement(arr);
       
        System.out.print(b);       
    }
}