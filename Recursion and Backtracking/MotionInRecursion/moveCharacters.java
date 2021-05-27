import java.io.*;
import java.util.*;

public class Solution {
   public static String moveCharacters(String str, char moveCh, int i){
       if(i==str.length()) return "";
       
       char ch= str.charAt(i);
       String ans = moveCharacters(str, moveCh, i+1);
        if(ch!=moveCh) return ch+ans;
        else return ans+ch;
        
    }
    public static void moveCharacters_wayUp(String str,String ans1, String ans2, char moveCh, int i){
        if(i==str.length()){
            System.out.print(ans1+ans2);
            return;
        }
        char ch= str.charAt(i);
        if(ch!=moveCh)
            moveCharacters_wayUp(str, ans1+ch, ans2, moveCh, i+1);
        else
            moveCharacters_wayUp(str, ans1, ans2+ch, moveCh, i+1);
        
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        char moveCh = scn.next().charAt(0);
        int idx = scn.nextInt();
        String ans = moveCharacters(str,moveCh,0);
        System.out.println(ans.charAt(idx));
        moveCharacters_wayUp(str, "", "", moveCh, 0);
    }
}