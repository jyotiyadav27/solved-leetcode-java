class State{
    int row;
    int col;
    int steps;
    State(int r, int c, int s){
        this.row = r;
        this.col = c;
        this.steps = s;
    }
}
class Solution {
    int m;
    int n;
    int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public int[][] updateMatrix(int[][] mat) {
        m = mat.length;
        n = mat[0].length;

        Queue<State> queue = new LinkedList<>();
        boolean[][] seen = new boolean[m][n];

        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (mat[row][col] == 0) {
                    queue.add(new State(row, col, 1));
                    seen[row][col] = true;
                }
            }
        }
        while (!queue.isEmpty()) {
            State state = queue.remove();
            int row = state.row, col = state.col, steps = state.steps;

            for (int[] direction: directions) {
                int nextRow = row + direction[0], nextCol = col + direction[1];
                if (valid(nextRow, nextCol, mat) && !seen[nextRow][nextCol]) {
                    seen[nextRow][nextCol] = true;
                    queue.add(new State(nextRow, nextCol, steps + 1));
                    mat[nextRow][nextCol] = steps;
                }
            }
        }
        return mat;
    }
    public boolean valid(int row, int col, int[][] mat) {
        return 0 <= row && row < m && 0 <= col && col < n && mat[row][col] == 1;
    }
}