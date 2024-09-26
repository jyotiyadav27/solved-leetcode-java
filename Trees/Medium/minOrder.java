class Solution {
    Set<String> road = new HashSet<>();
    Map<Integer, List<Integer>> graph = new HashMap<>();
    Set<Integer> seen = new HashSet<>();
    public int minReorder(int n, int[][] connections) {

        for(int i = 0; i < n; i++){
            graph.put(i, new ArrayList<>());
        }

        for(int[] connection: connections){
            int x = connection[0], y = connection[1];
            graph.get(x).add(y);
            graph.get(y).add(x);
            road.add(convertHash(x,y));
        }

        seen.add(0);
        return dfs(0);
    }
    public int dfs(int node){
        int ans = 0;
        for(int n: graph.get(node)){
            if(!seen.contains(n)){
                seen.add(n);
                if(road.contains(convertHash(node,n))){
                    ans++;
                }
                ans +=dfs(n);
            }
        }
        return ans;
    }

    public String convertHash(int row, int col){
        return String.valueOf(row) + "," + String.valueOf(col);
    }
}