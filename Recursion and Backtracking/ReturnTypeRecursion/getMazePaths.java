import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn =  new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        System.out.println(getMazePaths(0,0,n-1,m-1));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList < String > getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList < String > base=new ArrayList < >();
            base.add("");
            return base;
        }
        ArrayList < String > myAns=new ArrayList <>();
        if (sc + 1 <= dc) {
            ArrayList < String > Horizontal = getMazePaths(sr, sc + 1, dr, dc);
            for (String s: Horizontal) myAns.add("h" + s);
        }
        if (sr + 1 <= dr) {
            ArrayList < String > Vertical = getMazePaths(sr + 1, sc, dr, dc);
            for (String s: Vertical) myAns.add("v" + s);
        }
        if (sc + 1 <= dc && sr + 1 <= dr) {
            ArrayList < String > Diagonal = getMazePaths(sr+1, sc + 1, dr, dc);
            for (String s: Diagonal) myAns.add("d" + s);
        }
        return myAns;
    }
}