import java.io.*;
import java.util.*;

public class isPalindrome {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n;i++) arr[i] = scn.nextInt();
        System.out.print(isPalindrome(arr,0,n-1));
    }
    public static boolean isPalindrome(int[] arr, int vsi, int vei){ //virtual starting/ending index
        if(vsi>=vei) return true;
        if(arr[vsi]!=arr[vei]) return false;
        
        return isPalindrome(arr, vsi+1,vei-1);
    }
}