import java.util.Scanner;
import java.util.Arrays;

public class getAllSubstrings{

    public static void solution(String str){
        // my method
    
        int len=str.length();
        for(int i=0; i<=len; i++){
            for(int j=i; j<len; j++){
                String s = str.substring(i,j+1);
                if (isPalindrome(s))
                    System.out.println(s);
            }
        }
    }
        
        
    public static boolean isPalindrome(String str){
        int si=0, ei= str.length()-1;
        while(si<ei){
            if(str.charAt(si++) != str.charAt(ei--)) return false;
        }
        return true;
        
    }
}
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        getAllSubstrings(str);
    }
}