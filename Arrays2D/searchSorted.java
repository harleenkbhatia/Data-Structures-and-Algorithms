import java.util.Arrays;
import java.util.Scanner;

public class searchSorted {
    public static Scanner scn = new Scanner(System.in);
    public static void searchSorted(int[][] arr, int data){
        int i= arr.length - 1;
        int j=0;
        
        while(i >= 0 && j < arr.length){
            if(arr[i][j] < data) j++;
            else if(arr[i][j] > data) i--;
            else{
                System.out.println(i);
                System.out.println(j);
                return;
            }
        }
        System.out.print("Not Found");
    }

    public static void main(String[] args) throws Exception {
        int n = scn.nextInt();
        
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int data = scn.nextInt();
        searchSorted(arr,data);
    }

}