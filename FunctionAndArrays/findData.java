import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int findData(int[] arr, int data) {
        int index=-1;
        for (int i = 0; i < arr.length; i++) {
                if (arr[i] == data) {
                    index=i;
                
                    break;
                }
                
            }
            return index;
        }
    

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        
        int len = scn.nextInt();
        
        int[] arr= new int[len];
        for(int i=0; i<len; i++){
            arr[i]= scn.nextInt();
        }
        
        int data = scn.nextInt();
        
        System.out.print(findData(arr, data));

    }

}