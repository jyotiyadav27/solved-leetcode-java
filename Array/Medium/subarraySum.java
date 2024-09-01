class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        int ans =0;
        int curr = 0;
        m.put(0,1);
        for(int n: nums){
            curr += n;
            ans += m.getOrDefault(curr-k,0);
            m.put(curr,m.getOrDefault(curr,0)+1);
        }
        return ans;
    }
}