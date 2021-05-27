public class floodFillJump{
    public static int floodFillJump(int sr, int sc, int er, int ec, boolean[][] vis, int[][] dir, String[] dirS, String ans)
    {
        if(sr==er && sc==ec){
            System.out.println(ans);
            return 1;
        }
        vis[sr][sc] = true; //vis means visited
        int n = vis.length;
        int m = vis[0].length;

        int count = 0;
        for(int rad = 1; rad <= Math.max(n, m); rad++){
            for(int d = 0; d < dir.length; d++){
                int r = sr + dir[d][0];
                int c = sc + dir[d][1];

                //check wheather r c are on the boundary or not
                if(r >= 0 && c >= 0 && r < n && c < m && !vis[r][c]){
                    count += floodFillJump(r, c, er, ec, vis, dir, dirS, ans + dirS[d] + rad);
                }
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
        System.out.println(floodFillJump(0, 0, n-1, m-1,vis, dir, dirS, ""));
    } 
     // https://www.geeksforgeeks.org/rat-in-a-maze-backtracking-2/
    // https://www.geeksforgeeks.org/count-number-ways-reach-destination-maze/
    // https://www.geeksforgeeks.org/rat-in-a-maze-with-multiple-steps-jump-allowed/?ref=rp
    // https://www.geeksforgeeks.org/rat-in-a-maze-problem-when-movement-in-all-possible-directions-is-allowed/?ref=rp
}