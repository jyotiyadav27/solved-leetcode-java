class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int seq = 1;
        int small = nums[0];
        for(int i = 0; i < nums.length; i++){
            if( nums[i] > small + k){
                seq++;
                small = nums[i];
            }
        }
        return seq;
    }
}