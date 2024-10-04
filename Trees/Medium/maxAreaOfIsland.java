class Solution {
    int m;
    int n;
    int[][] g;

    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        m = grid.length;
        n =  grid[0].length;
        g = grid;

        for (int i = 0; i < m ; i++){
            for(int j = 0; j < n; j++){
                if(g[i][j] == 1){

                    max = Math.max(max,  dfs(i,j));
                    System.out.println(max);
                }
            }
        }
        return max;
    }
    public int dfs(int i, int j){
        if(i < 0 || i >= m || j < 0 || j >= n || g[i][j] != 1) return 0;
        g[i][j] = 0;
        return (1 + dfs(i+1, j) + dfs(i-1, j) + dfs(i, j-1)+ dfs(i, j+1));

    }
}