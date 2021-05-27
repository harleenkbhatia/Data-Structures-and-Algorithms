import java.io.*;
import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String str = scn.nextLine();
        System.out.println(getKPC(str, 0));

    }
    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    
    public static ArrayList<String> getKPC(String str, int idx) {
        if(idx==str.length()){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> recAns = getKPC(str, idx+1);
        ArrayList<String> myAns = new ArrayList<>();
        
        char ch = str.charAt(idx);
        String code = codes[ch-'0'];
        int count = 0;
        
        for(int i=0; i<code.length(); i++){
            char c=code.charAt(i);
            
            for(String s : recAns) myAns.add(c+s);
        }
        return myAns;
    }

}