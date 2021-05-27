import java.util.Arrays;
import java.util.Scanner;

public class diffOfTwoArrays{
    
    public static void diffOfTwoArrays(int[] arr1, int[] arr2){
        
        int p=arr1.length, q=arr2.length;
        int r = Math.max(p,q);
        int[] ans = new int[r];
        int borrow = 0, i = p - 1, j = q - 1, k = r-1;
        
        while(k>=0){
            // int sub= borrow;
            int sub = borrow + (j>=0 ? arr2[j--] : 0) - (i>=0 ? arr1[i--] : 0);
            /* ? ternary operator
            syntax: condition ? s1 : s2 
            if condition is True s1 will occur and if condition if False s2 will occur */
            
            //if(j >= 0) sub += arr2[j--];
            //if(i >= 0) sub -= arr1[i--];

            if(sub < 0) {
                sub += 10;
                borrow = -1;
            }
            else borrow = 0;
            
            ans[k--] = sub;
    }
    boolean flag = false;
    for(int l=0; l < ans.length; l++){
        if(!flag && ans[l]==0) continue;
        System.out.println(ans[l]);
        flag = true;
    }
}
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int len1 = scn.nextInt();
        int[] arr1= new int[len1];
        for(int i=0; i<len1; i++){
            arr1[i]= scn.nextInt();
            
        }
        int len2 = scn.nextInt();
        int[] arr2= new int[len2];
        for(int j=0; j<len2; j++){
            arr2[j]= scn.nextInt();
            
        }
        diffOfTwoArrays(arr1,arr2);
        
    }
    
}