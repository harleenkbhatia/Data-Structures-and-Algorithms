import java.util.Scanner;
import java.util.Arrays;

public class getAllSubstrings{
    // my method
    public static void getAllSubstrings(String str){
        int len=str.length();
        for(int i=0; i<=len; i++){
            for(int j=i; j<len; j++){
                System.out.println(str.substring(i,j+1));
            }
        }
        
    }
    /* sir's method
    public static void solution(String str) {
        int len= str.length();
        for(int i=0; i<len; i++){
            for(int j=1; i+j<=len; j++){
                System.out.println(str.substring(i,i+j));
            }
        }

    }*/ 
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        getAllSubstrings(str);
    }
}