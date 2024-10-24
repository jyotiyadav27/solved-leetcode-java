class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = max(piles);
        while(l < r){
            int mid = l + (r - l)/2;
            if(feasible(piles, h, mid)){
                r = mid;
            } else l = mid + 1;
        }
        return l;
    }
    public int max(int[] a){
        int max = Integer.MIN_VALUE;
        for(int n: a){
            max = Math.max(max,n);
        }
        return max;
    }
    public boolean feasible(int[] piles, int h, int mid){
        int sum = 0;
        for(int p: piles){
            sum += (p-1)/mid + 1;
        }
        return (sum <= h);
    }
}