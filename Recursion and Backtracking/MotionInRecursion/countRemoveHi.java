import java.util.Scanner;
public class Main{
    
    public static Scanner scn = new Scanner(System.in);
    
    public static String removeHi(String str, int idx){
        if(idx >= str.length() - 1) {
            if(idx==str.length()-1) return(str.charAt(idx)+"");
            return "";
        }
        String s = str.substring(idx, idx + 2);
        
        if(s.equals("hi"))
            return removeHi(str, idx+2);
        else 
            return str.charAt(idx) + removeHi(str, idx+1);
    }
    public static void removeHi_wayUp(String str,int idx, String ans){
        if(idx >= str.length() - 1) {
            if(idx==str.length()-1) ans+=str.charAt(idx);
            System.out.println(ans);
            return;
        }
        String s = str.substring(idx, idx + 2);
        
        if(s.equals("hi"))
            removeHi_wayUp(str, idx+2, ans);
        else 
            removeHi_wayUp(str, idx+1, ans + str.charAt(idx));
    }
    public static int countHi(String str, int idx){
        
        if(idx >= str.length() - 1) return 0;
        
        String s = str.substring(idx, idx + 2);
        
        if(s.equals("hi"))
            return countHi(str, idx+2) + 1;
        else 
            return countHi(str, idx+1);
    }
    public static void main(String[] args){
        String str = scn.next();
        int idx = scn.nextInt();
        System.out.println(countHi(str,0));
        
        System.out.println(removeHi(str,0).charAt(idx));
        System.out.println(removeHi(str,0));
        //removeHi_wayUp(str,0,"");
    }
}