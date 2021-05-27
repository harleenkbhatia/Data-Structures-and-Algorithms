import java.io.*;
import java.util.*;

//Q38 on hackerrank
// https://www.hackerrank.com/contests/pepdec62017/challenges/pep-java-7recursion-38asciisubsequences/submissions/code/1329637140

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(printASCII_count(str, 0, ""));
        System.out.println(getSubsequence(str, 0));
        printASCII(str, 0, "");
        //printSS_02(str,0, new StringBuilder());
    }
    public static ArrayList < String > getSubsequence(String str, int idx) {
        if (idx == str.length()) {
            ArrayList < String > base = new ArrayList < > ();
            base.add("");
            return base;
        }
        ArrayList < String > recAns = getSubsequence(str, idx + 1);

        ArrayList < String > myAns = new ArrayList < > (); //nahi aane ki choice dekhli
        
        char ch = str.charAt(idx);
        for (String s: recAns) {
            myAns.add(s);
            myAns.add(s + ch);
            myAns.add(s + (int)ch);
            
        }
        
        return myAns;
    }

    public static int printASCII(String str, int idx, String ans) {
        if (idx == str.length()) {
            System.out.println(ans);
            return 1;
        }
        int count =0;
        
        count+=printASCII(str, idx + 1, ans);
        count+=printASCII(str, idx + 1, ans + str.charAt(idx));
        count+=printASCII(str, idx + 1, ans + (int)str.charAt(idx));
        return count;
    }
    public static int printASCII_count(String str, int idx, String ans) {
        if (idx == str.length()) {
            return 1;
        }
        int count =0;
        
        count+=printASCII_count(str, idx + 1, ans);
        count+=printASCII_count(str, idx + 1, ans + str.charAt(idx));
        count+=printASCII_count(str, idx + 1, ans + (int)str.charAt(idx));
        return count;
    }
    
}