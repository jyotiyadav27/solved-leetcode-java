class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l = 1, r = max(nums);
        while(l < r){
            int mid = l + (r - l)/2;
            if(correct(nums, threshold, mid)){
                r = mid;
            } else l = mid + 1;
        }
        return l;
    }
    public boolean correct(int[] nums, int t, int mid){
        int sum = 0;
        for(int n: nums){
            sum += (n-1)/mid + 1;
        }
        return sum <= t;
    }
    public int max(int[] nums){
        int max = 0;
        for(int n : nums){
            max = Math.max(max, n);
        }
        return max;
    }
}