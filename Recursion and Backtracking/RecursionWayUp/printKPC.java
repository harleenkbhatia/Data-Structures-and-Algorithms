import java.io.*;
import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String str = scn.nextLine();
        printKPC(str, 0, "");

    }
    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static int printKPC(String str, int idx, String ans) {
        if(idx==str.length()){
            System.out.println(ans);
            return 1;
        }
        char ch = str.charAt(idx);
        String code = codes[ch-'0'];
        int count = 0;
        
        for(int i=0; i<code.length(); i++){
            char c=code.charAt(i);
            count+= printKPC(str, idx+1, ans+c);
        }
        return count; // count will tell us how many combinations / calls where made.
    }

}