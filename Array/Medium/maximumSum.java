class Solution {
    public int maximumSum(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        int ans =-1;
        for(int n:nums){
            int sum = calculateSum(n);
            if(m.containsKey(sum)){
                int prev = m.get(sum);
                ans = Math.max(ans, prev+n);
                m.put(sum, Math.max(prev,n));
            } else {
                m.put(sum, n);}
        }
        return ans;
    }

    public int calculateSum(int n){
        int sum =0;
        while(n!=0){
            sum += n % 10;
            n = n/10;
        }
        return sum;
    }
}