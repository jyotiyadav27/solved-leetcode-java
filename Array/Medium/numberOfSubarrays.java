class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0,1);
        int ans =0;
        int curr =0;
        for (int n: nums){
            curr += n%2;
            ans += m.getOrDefault(curr-k,0);
            m.put(curr, m.getOrDefault(curr,0)+1);
        }
        return ans;
    }
}