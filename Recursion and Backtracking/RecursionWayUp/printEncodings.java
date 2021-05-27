import java.io.*;
import java.util.*;

public class printEncodings {

    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String str = scn.next();
        printEncodings(str, "");
    }
    static String[] codes = {"", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    public static void printEncodings(String str, String ans) {
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        else if(str.length() == 1){
            char ch = str.charAt(0);
            if(ch == '0') {
                return;
            }
            else {
                System.out.println(ans + codes[ch - '0']);
            }
        }
        else{
            char ch = str.charAt(0);
            String ros = str.substring(1);
            if(ch == '0') {
                return;
            }
            else {
                int chv = ch - '0';
                printEncodings(ros, ans + codes[chv]);
            }
            String ch12 = str.substring(0,2);
            String ros1 = str.substring(2);
            int n = Integer.parseInt(ch12);// ch12 - '0' - substring - char not possible 
            if(n<=26){
                printEncodings(ros1, ans + codes[n]);
            }
        }
        
    }

}
