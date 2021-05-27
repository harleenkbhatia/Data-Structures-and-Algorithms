import java.io.*;
import java.util.*;

public class getMazePathJumps{

    public static void main(String[] args) throws Exception {
        Scanner scn =  new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        System.out.println(getMazePathJumps(0,0,n-1,m-1));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList < String > getMazePathJumps(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList < String > base=new ArrayList < >();
            base.add("");
            return base;
        }
        ArrayList < String > myAns=new ArrayList <>();
        for(int jump=1;sc + jump <= dc; jump++) {
            ArrayList < String > Horizontal = getMazePathJumps(sr, sc + jump, dr, dc);
            for (String s: Horizontal) myAns.add("h"+ jump + s);
        }
        for(int jump=1;sr + jump <= dr; jump++) {
            ArrayList < String > Vertical = getMazePathJumps(sr + jump, sc, dr, dc);
            for (String s: Vertical) myAns.add("v"+ jump + s);
        }
        for(int jump=1;sc + jump <= dc && sr + jump <= dr; jump++) {
            ArrayList < String > Diagonal = getMazePathJumps(sr+1, sc + 1, dr, dc);
            for (String s: Diagonal) myAns.add("d" + jump+ s);
        }
        return myAns;
    }
}