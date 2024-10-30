class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(new ArrayList<>(), 1, ans, n, k);
        return ans;
    }
    public void backtrack(List<Integer> curr, int index, List<List<Integer>> ans, int n, int k){
        if(curr.size() == k){
            ans.add(new ArrayList<>(curr));
        }
        for(int j = index; j <= n; j++){
            curr.add(j);
            backtrack(curr, j + 1, ans, n, k);
            curr.remove(curr.size() - 1);
        }
    }
}