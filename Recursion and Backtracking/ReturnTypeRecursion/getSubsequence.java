import java.util.Scanner;

public class getSubsequence {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(getSubsequence(str, 0));
    }

    public static ArrayList < String > getSubsequence(String str, int idx) {
        if (idx == str.length()) {
            ArrayList < String > base = new ArrayList < > ();
            base.add("");
            return base;
        }
        ArrayList < String > recAns = getSubsequence(str, idx + 1);

        ArrayList < String > myAns = new ArrayList < > (recAns); //nahi aane ki choice dekhli
        char ch = str.charAt(idx);
        for (String s: recAns) {
            myAns.add(ch+s);
        }
        return myAns;
    }

}