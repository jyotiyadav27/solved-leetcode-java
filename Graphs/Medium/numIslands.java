class Solution {
    int m;
    int n;
    int[][] directions = new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
    boolean[][] seen;
    public int numIslands(char[][] grid) {
        int ans = 0;
        m = grid.length;
        n = grid[0].length;
        seen = new boolean[m][n];
        for (int r = 0; r < m; r++){
            for(int c = 0; c < n; c++){
                if(grid[r][c] == '1' && !seen[r][c]){
                    ans++;
                    seen[r][c] = true;
                    dfs(r, c, grid);
                }
            }
        }
        return ans;

    }

    public boolean valid(int row, int col, char[][] grid) {
        return 0 <= row && row < m && 0 <= col && col < n && grid[row][col] == '1';
    }

    public void dfs(int row, int col, char[][] grid){
        for(int[] direction: directions){
            int nextRow = row + direction[0], nextCol = col + direction[1];
            if(valid(nextRow, nextCol, grid) && !seen[nextRow][nextCol]){
                seen[nextRow][nextCol] = true;
                dfs(nextRow, nextCol, grid);
            }
        }
    }
}