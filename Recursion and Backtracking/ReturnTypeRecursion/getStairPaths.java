import java.io.*;
import java.util.*;

public class getStairPaths{

    public static void main(String[] args) throws Exception {
        Scanner scn =  new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(getStairPaths(0,0,0,n));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList < String > getStairPaths(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList < String > base=new ArrayList < >();
            base.add("");
            return base;
        }
        ArrayList < String > myAns=new ArrayList <>();
        for(int jump=1;sc + jump <= dc && jump<=3 ; jump++) {
            ArrayList < String > Horizontal = getStairPaths(sr, sc + jump, dr, dc);
            for (String s: Horizontal) myAns.add( jump + s);
        }
        return myAns;
    }
    
}