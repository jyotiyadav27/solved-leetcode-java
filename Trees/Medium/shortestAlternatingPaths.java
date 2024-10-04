
class Solution {
    Map<Integer, List<List<Integer>>> adj;
    boolean[][] visit;
    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        adj = new HashMap<>();
        visit = new boolean[n][2];

        for(int[] e: redEdges){
            adj.computeIfAbsent(e[0], k-> new ArrayList<List<Integer>>()).add(Arrays.asList(e[1],0));
        }

        for(int[] e: blueEdges){
            adj.computeIfAbsent(e[0], k-> new ArrayList<List<Integer>>()).add(Arrays.asList(e[1],1));
        }

        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[]{0,0,-1});
        ans[0] = 0;
        visit[0][1] = visit[0][0] = true;

        while(!q.isEmpty()){
            int[] e = q.poll();
            int node = e[0], steps = e[1], pCol = e[2];

            if(!adj.containsKey(node)){
                continue;
            }
            for(List<Integer> ne: adj.get(node)){
                int neighbour = ne.get(0);
                int color = ne.get(1);
                if(!visit[neighbour][color] && color !=pCol ){
                    if(ans[neighbour] == -1){
                        ans[neighbour] = steps + 1;
                    }
                    visit[neighbour][color] = true;
                    q.offer(new int[]{neighbour, steps + 1, color});
                }
            }
        }
        return ans;

    }
}