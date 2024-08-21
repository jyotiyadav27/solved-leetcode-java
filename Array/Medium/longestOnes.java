class Solution {
    public int longestOnes(int[] nums, int k) {
        int curr=0;
        int ans=0;
        int l=0;
        for(int r=0; r<nums.length; r++){
            if(nums[r]==0){
                curr++;
            }
            while(curr>k){
                if(nums[l]==0){
                    curr--;
                }
                l++;
            }
            ans = Math.max(ans, r-l+1);
        }
        return ans;
    }
}