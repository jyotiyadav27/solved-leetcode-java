class Solution {
    public int splitArray(int[] nums, int k) {
        int left = max(nums);
        int right = sum(nums);
        while(left < right){
            int mid = left + (right - left)/2;
            if(feasible(nums, k, mid)){
                right = mid;
            }else left = mid + 1;
        }
        return left;
    }
    public int max(int[] a){
        int max =Integer.MIN_VALUE;
        for(int n : a){
            max = Math.max(max, n);
        }
        return max;
    }
    public int sum(int[] a){
        int sum = 0;
        for(int n: a){
            sum +=n;
        }
        return sum;
    }
    public boolean feasible(int[] nums, int k, int mid){
        int total = 0;
        int count = 1;
        for(int n: nums){
            total += n;
            if(total > mid){
                total = n;
                count += 1;
                if(count > k){
                    return false;
                }
            }
        }
        return true;
    }
}