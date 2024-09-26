class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        for(List<Integer> e: edges){
            seen.add(e.get(1));
        }
        for(int i =0; i < n; i++){
            if(!seen.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}