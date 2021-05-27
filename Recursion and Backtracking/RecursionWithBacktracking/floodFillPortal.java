import java.io.*;
import java.util.*;

public class Main {
    public static void floodFill(int sr, int sc, int er, int ec, int[][] vis, int[][] dir, String[] dirS, String ans)
    {
        if(sr==er && sc==ec){
            System.out.println(ans);
            return;
        }
        vis[sr][sc] = 1; //vis means visited
        int n = vis.length;
        int m = vis[0].length;

        int count = 0;
        for(int d = 0; d < dir.length; d++){
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];

            //check wheather r c are on the boundary or not
            if(r >= 0 && c >= 0 && r < n && c < m && vis[r][c]==0){
                floodFill(r, c, er, ec, vis, dir, dirS, ans + dirS[d]);
            }
        }
        vis[sr][sc] = 0;
        return;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int[][] dir = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
        String[] dirS = {"t", "l", "d", "r"};
        
        floodFill(0, 0, n-1, m-1 ,arr , dir, dirS, "");
    }

}
