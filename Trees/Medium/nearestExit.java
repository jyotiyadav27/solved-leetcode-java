
class Solution {
    int m, n;
    int[][] directions = new int[][]{{-1,0},{0,-1},{1,0},{0,1}};
    public int nearestExit(char[][] maze, int[] entrance) {
        m = maze.length;
        n = maze[0].length;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{entrance[0], entrance[1], 0});
        maze[entrance[0]][entrance[1]] = '+';
        while(!q.isEmpty()){
            int[] node = q.poll();
            int row = node[0], col = node[1], steps = node[2];
            for(int[] dir: directions){
                int nR = row + dir[0], nC = col + dir[1];
                if(0 <= nR && nR < m && 0 <= nC && nC < n && maze[nR][nC] == '.' ){

                    if (nR == 0 || nR == m - 1 || nC == 0 || nC == n - 1)
                        return steps + 1;

                    q.offer(new int[]{nR, nC, steps + 1});
                    maze[nR][nC] = '+';
                }
            }

        }
        return -1;

    }

}