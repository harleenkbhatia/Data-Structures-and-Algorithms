import java.io.*;
import java.util.*;

public class Solution {
    public static boolean checkRev(String str, String str2, int idx, int idx2){
        if(idx2==-1) return true;
        if(str.charAt(idx) != str2.charAt(idx2)) return false;
        
        return checkRev(str, str2 , idx + 1, idx2 - 1);        
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str= scn.nextLine();
        String str2= scn.nextLine();
        
        if(str.length() == str2.length())
            System.out.print(checkRev(str, str2, 0, str2.length()-1));
        else System.out.print(false);
    }
}