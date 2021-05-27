import java.io.*;
import java.util.*;

public class Main {
    public static Scanner scn=new Scanner(System.in);
    
    public static int[] prefixSumArray(int[] arr){
        int n=arr.length;
        int[] psum = new int[n+1];
        for(int i=0; i<n; i++){
            psum[i+1] = psum[i] + arr[i];
        }
        return psum;
        }
        
    public static void resolveQuery() {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int[] psum = prefixSumArray(arr);
        int q= scn.nextInt();
        
        while(q-- > 0){
            //q--> means until q is 0
            int si=scn.nextInt();
            int ei=scn.nextInt();
            System.out.println(psum[ei + 1] - psum[si]);
        }
    }

    public static void main(String[] args) throws Exception {
        resolveQuery();
    }

}
/* input 
10
1 2 3 4 5 6 7 8 9 10
5
0 9
1 4
1 1
2 3
4 8 */