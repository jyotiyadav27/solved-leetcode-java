class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(new ArrayList<>(), 0, ans, nums, k);
        return ans;
    }
    public void backtrack(List<Integer> curr, int index, List<List<Integer>> ans, int[] nums, int k){
        ans.add(new ArrayList<>(curr));
        for(int j = index; j < nums.length; j++){
            curr.add(nums[j]);
            backtrack(curr, j + 1, ans, nums);
            curr.remove(curr.size() - 1);
        }
    }
}