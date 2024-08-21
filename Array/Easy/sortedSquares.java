class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int square;
        int[] result = new int[nums.length];
        for(int i=nums.length-1; i>=0; i--){
            if(Math.abs(nums[l])<=Math.abs(nums[r])){
                square = nums[r];
                r--;
            }
            else {
                square=nums[l];
                l++;
            }
            result[i]= square * square;
        }
        return result;
    }
}