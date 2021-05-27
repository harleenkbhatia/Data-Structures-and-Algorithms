import java.io.*;
import java.util.*;

public class printAllPermutations{

	public static void printAllPermutations(String str){
		ArrayList<String> ans = new ArrayList<>();
		ans.add("");
		for(int i=0; i<str.length(); i++){
		    char ch=str.charAt(i);
		    ArrayList<String> myAns = new ArrayList<>();
		    for(String s: ans){
		        for(int j=0; j<=s.length(); j++){
		            myAns.add(s.substring(0,j)+ch+s.substring(j));
		        }
		    }
		    ans= myAns;
		}
	    System.out.println(ans);
	}
	public static void permutationsIteratively(String str){
		int n = str.length();
		int f = factorial(n);
		
		for(int i=0; i<f; i++){
		    StringBuilder sb = new StringBuilder(str);
		    int temp = i;
		    
		    for(int div = n; div>=1; div--){
		        int q=temp/div;
		        int r= temp%div;
		        System.out.print(sb.charAt(r));
		        sb.deleteCharAt(r);
		        temp=q;
		        
		    }
		    System.out.println();
		}
		
	}
	public static int factorial(int n){
	    int val = 1;
	    for(int i=2; i<=n; i++){
	        val *= i;
	    }
	    return val;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		printAllPermutations(str);
		permutationsIteratively(str);
	}
}