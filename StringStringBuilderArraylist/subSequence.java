import java.util.Scanner;
import java.util.ArrayList;

public class Main{

    public static ArrayList<String> subSequence(String str) {
        ArrayList<String> ans =new ArrayList<>();
        ans.add("");

        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            int size=ans.size();
            for(int j=0; j<size; j++){
                ans.add(ans.get(j) + ch);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next(); //or scn.nextLine();
        System.out.println(subSequence(str));
    }

}