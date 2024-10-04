class State{
    int r;
    int c;
    int s;
    State(int r, int c, int s){
        this.r = r;
        this.c = c;
        this.s = s;
    }
}

class Solution {
    int n;
    int[][] dir ={{-1,-1}, {-1,0},{-1,1},{0,-1},{0,1},{1,0},{1,-1},{1,1}};
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0] == 1){
            return -1;
        }
        n = grid.length;

        Queue<State> q = new LinkedList<>();
        boolean[][] seen = new boolean[n][n];
        seen[0][0] = true;
        q.add(new State(0,0,1));
        while(!q.isEmpty()){
            State s1 = q.remove();
            int r = s1.r, c = s1.c, s = s1.s;
            if(r == n - 1 && c == n - 1){
                return s;
            }

            for(int[] d: dir){
                int nextR = r + d[0], nextC = c + d[1];
                if(isValid(nextR, nextC, grid) && !seen[nextR][nextC]){
                    seen[nextR][nextC] = true;
                    q.add(new State(nextR, nextC, s + 1));
                }

            }
        }
        return -1;
    }
    public boolean isValid(int row, int col, int[][] grid){
        return 0 <= row && row < n && 0 <= col && col < n && grid[row][col] == 0;
    }

}