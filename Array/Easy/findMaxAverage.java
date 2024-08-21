class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double currAvg;
        int sum=0;
        double ans=0;
        for(int i =0; i<k; i++){
            sum = sum +  nums[i];
        }
        currAvg = 1.0*sum/k;
        ans = currAvg;
        System.out.println(currAvg);
        for(int i=k;i<nums.length;i++){
            sum += nums[i]-nums[i-k];
            currAvg = 1.0*sum/k;
            ans = Math.max(currAvg,ans);
        }
        return ans;
    }
}