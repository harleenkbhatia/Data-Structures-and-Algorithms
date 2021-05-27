import java.util.Scanner;
import java.util.Arrays;

public class isPalindrome{
    public static boolean isPalindrome(String str){
        int si=0, ei=ei.str.length()-1;
        while(si<ei){
            if(str.charAt(si++) != str.charAt(ei--)) return false;
        }
        return true;
        
    }
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        getAllSubstrings(str);
    }
}