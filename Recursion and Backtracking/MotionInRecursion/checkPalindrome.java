import java.io.*;
import java.util.*;

public class checkPalindrome {
    public static boolean checkPalindrome(String str, int i, int j){
        if(i>=j) return true;
        char ch1= str.charAt(i);
        char ch2= str.charAt(j);
        int diff1 = (ch1 >= 'A' && ch1 <= 'Z') ? ch1 - 'A' : ch1 - 'a';
        int diff2 = (ch2 >= 'A' && ch2 <= 'Z') ? ch2 - 'A' : ch2 - 'a';
        if(diff1 != diff2) return false;
        return checkPalindrome(str, i+1, j-1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(checkPalindrome(str, 0, str.length()-1));
    }
}