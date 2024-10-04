class Solution {
    Set<Integer> seen = new HashSet<>();
    Map<Integer, List<Integer>> graph = new HashMap<>();
    Set<Integer> r;
    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        r = Arrays.stream(restricted).boxed().collect(Collectors.toSet());

        for (int[] edge : edges) {
            graph.computeIfAbsent(edge[0], value -> new ArrayList<>()).add(edge[1]);
            graph.computeIfAbsent(edge[1], value -> new ArrayList<>()).add(edge[0]);
        }
        seen.add(0);
        dfs(0);

        return seen.size();
    }
    public void dfs(int node){
        for(int n : graph.get(node)){
            if(!seen.contains(n) && !r.contains(n)){
                seen.add(n);
                dfs(n);
            }
        }

    }
}