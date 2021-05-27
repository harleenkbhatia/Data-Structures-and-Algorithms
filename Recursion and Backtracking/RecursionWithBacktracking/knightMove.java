import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sr = scn.nextInt();
        int sc = scn.nextInt();
        int[][] dir = { { -2, 1 }, { -1, 2 }, { 1, 2 }, { 2, 1 }, { 2, -1 }, { 1, -2 }, { -1, -2 }, { -2, -1 } };
            
        int[][] vis = new int[n][n];
        for (int[] d: vis) Arrays.fill(d, 0);

        knightMove(sr, sc, 1, n * n, vis, dir);
    }
    public static void printBoard(int[][] chess) {
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[0].length; j++) {
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
    public static int knightMove(int sr, int sc, int move, int tnc, int[][] vis, int[][] dir) {
        if (move == tnc) {
            vis[sr][sc] = move;
            printBoard(vis);
            vis[sr][sc] = 0;
            return 1;
        }
        vis[sr][sc] = move; //vis means visited
        int n = vis.length;
        int m = vis[0].length;

        int count = 0;
        for (int d = 0; d < dir.length; d++) {
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];

            //check wheather r c are on the boundary or not
            if (r >= 0 && c >= 0 && r < n && c < m && vis[r][c] == 0) {
                count += knightMove(r, c, move + 1, tnc, vis, dir);
            }
        }
        vis[sr][sc] = 0;
        return count;
    }

    
}