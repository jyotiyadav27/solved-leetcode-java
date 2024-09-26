class Solution {
    Set<Integer> seen = new HashSet<>();

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        seen.add(0);
        dfs(0, rooms);
        return seen.size() == rooms.size();
    }
    public void dfs(int node, List<List<Integer>> rooms){
        for(int n: rooms.get(node)){
            if(!seen.contains(n)){
                seen.add(n);
                dfs(n, rooms);
            }
        }
    }
}