/**
 * Created by OovEver on 2017/6/29.
 */
public class LeetCode200 {
    private    static int mm, n;
    private static int[][] d={{0,1},{1,0},{0,-1},{-1,0}};
  static   boolean[][] visited;

   static boolean inArea(int x, int y) {
       return x >= 0 && x < mm && y >= 0 && y < n;
    }

    public static int numIslands(char[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        mm = grid.length;
        n = grid[0].length;
        visited = new boolean[mm][n];
        for(int i=0;i<mm;i++)
        for(int j=0;j<n;j++){
            visited[i][j] = false;
        }
        int res = 0;
        for(int i=0;i<mm;i++) {
            for(int j=0;j<n;j++) {
                if( grid[i][j] == '1' && !visited[i][j] ){
                    dfs(grid,i,j);
                    res++;
                }
            }
        }

        return res;
    }
    static   void dfs(char[][] grid,int x,int y) {
        visited[x][y] = true;
        for(int i=0;i<4;i++) {
            int newx = x + d[i][0];
            int newy = y + d[i][1];
            System.out.println(inArea(newx, newy));
            if( inArea(newx, newy) && !visited[newx][newy] && grid[newx][newy] == '1' )
                dfs( grid , newx , newy );
        }
        return;
    }


    public static void main(String[] args) {
        char[][] g1 = {
            {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'}};
        char[][] nums = {{'1','1','1','1','0'}, {'1','1','0','1','0'}, {'1','1','0','0','0'}, {'0','0','0','0','0'}};
        System.out.println(numIslands(g1));
    }

}
