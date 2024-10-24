class Solution {
    public int findKthNumber(int m, int n, int k) {
        int l = 1, r = m * n;
        while(l < r){
            int mid = l + (r-l)/2;
            if(feasible(m,n,k,mid)){
                r = mid;
            } else l = mid + 1;
        }
        return l;
    }
    public boolean feasible(int m , int n, int k, int mid){
        int count = 0;
        for (int i = 1; i <= m; i++) {
            count += Math.min(mid / i, n);
        }
        return count >= k;
    }
}