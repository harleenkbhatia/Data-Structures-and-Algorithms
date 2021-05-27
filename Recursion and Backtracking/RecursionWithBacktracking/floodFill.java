public class floodFill{
    public static int floodFill(int sr, int sc, int er, int ec, boolean[][] vis, int[][] dir, String[] dirS, String ans)
    {
        if(sr==er && sc==ec){
            System.out.println(ans);
            return 1;
        }
        vis[sr][sc] = true; //vis means visited
        int n = vis.length;
        int m = vis[0].length;

        int count = 0;
        for(int d = 0; d < dir.length; d++){
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];

            //check wheather r c are on the boundary or not
            if(r >= 0 && c >= 0 && r < n && c < m && !vis[r][c]){
                count += floodFill(r, c, er, ec, vis, dir, dirS, ans + dirS[d]);
            }
        }
        vis[sr][sc] = false;
        return count;
    }
    public static void main(String[] args){
        int[][] dir = {{0, -1}, {1, 0}, {0, 1}, {-1, 0}};
        String[] dirS = {"L", "D", "R", "U"};
        int n = 2, m = 2;
        boolean[][] vis = new boolean[n][m];
        System.out.println(floodFill(0, 0, n-1, m-1,vis, dir, dirS, ""));
    } 
}