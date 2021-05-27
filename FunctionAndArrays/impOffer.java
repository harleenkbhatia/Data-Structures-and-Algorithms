import java.util.Arrays;
import java.util.Scanner;
public class impOffer{
    public static int impOffer(int[] arr){
        int m = arr.length;
        int count = 0;
        int minEle = (int)1e9;
        for(int i = 0; i<m; i++)
            minEle = Math.min(minEle, arr[i]);            
        
        for(int i = 0; i<m; i++){
            if(arr[i] > minEle){
                count+=2;
                
            }
            
            else count++; 
        }

        return count;
    }
    public static void main(String[] args) throws Exception{
        Scanner scn=new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 0; i<n; i++){
            int len = scn.nextInt();
        
            int[] arr= new int[len];
            for(int j=0; j<len; j++){
                arr[i]= scn.nextInt();
            }
            int z = impOffer(arr);
            System.out.println("Case #"+i+": "+z);
        }

    }

}