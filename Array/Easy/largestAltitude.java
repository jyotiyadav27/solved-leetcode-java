class Solution {
    public int largestAltitude(int[] gain) {

        int n= gain.length;
        int[] prefix = new int[n+1];

        prefix[0]= 0;
        int ans=0;
        for(int i=0; i<n; i++){
            prefix[i+1]= gain[i]+prefix[i];
            ans = Math.max(ans, prefix[i+1]);
        }
        return ans;
    }
}