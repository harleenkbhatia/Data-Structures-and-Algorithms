import java.io.*;
import java.util.*;

public class printMazePathJumps {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        printMazePathJumps(0, 0, n - 1, m - 1, "");
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePathJumps(int sr, int sc, int dr, int dc, String ans) {
        if (sr == dr && sc == dc) {
            System.out.println(ans);
            return;
        }
        for (int jump = 1; sc + jump <= dc; jump++) {
            printMazePathJumps(sr, sc + jump, dr, dc, ans + 'h' + jump);
        }
        for (int jump = 1; sr + jump <= dr; jump++) {
            printMazePathJumps(sr + jump, sc, dr, dc, ans + 'v' + jump);
        }
        for (int jump = 1; sc + jump <= dc && sr + jump <= dr; jump++) {
            printMazePathJumps(sr + jump, sc + jump, dr, dc, ans + 'd' + jump);
        }

    }

}