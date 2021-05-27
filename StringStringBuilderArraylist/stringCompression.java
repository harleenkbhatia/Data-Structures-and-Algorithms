import java.io.*;
import java.util.*;

public class stringCompression {

    public static String compression1(String str) {
    if(str.length()<=1) return str;
        StringBuilder sb= new StringBuilder();
        sb.append(str.charAt(0));
        
        for(int i=1; i<=str.length(); i++){
            int count=1;
            while(i < str.length() && str.charAt(i-1) == str.charAt(i)){
                count++;
                i++;
            }
            //if(count != 1) sb.append(count);
            if(i<str.length()) sb.append(str.charAt(i));
        }
        
    
        return sb.toString();
    }

    public static String compression2(String str) {
        
    if(str.length()<=1) return str;
        StringBuilder sb= new StringBuilder();
        sb.append(str.charAt(0));
        
        for(int i=1; i<=str.length(); i++){
            int count=1;
            while(i < str.length() && str.charAt(i-1) == str.charAt(i)){
                count++;
                i++;
            }
            if(count != 1) sb.append(count);
            if(i<str.length()) sb.append(str.charAt(i));
        }
        
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
    }

}