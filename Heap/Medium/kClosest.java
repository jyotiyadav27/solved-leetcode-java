class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Queue<int[]> pq = new PriorityQueue<>((a,b) -> b[0]-a[0]);
        for(int i = 0; i < points.length; i++){
            int[] e = {square(points[i]),i};
            if(pq.size() < k){
                pq.add(e);
            } else if(e[0] < pq.peek()[0]){
                pq.poll();
                pq.add(e);
            }
        }
        int[][] ans = new int[k][2];
        for (int i = 0; i < k; i++) {
            int entryIndex = pq.poll()[1];
            ans[i] = points[entryIndex];
        }
        return ans;
    }
    private int square(int[] p){
        return p[0] * p[0] + p[1] * p[1];
    }
}