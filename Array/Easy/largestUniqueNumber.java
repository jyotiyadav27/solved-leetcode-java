class Solution {
    public int largestUniqueNumber(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int n : nums){
            m.put(n, m.getOrDefault(n,0)+1);
        }
        int max=-1;
        for(int key: m.keySet()){
            int k = m.get(key);
            if((k==1) ){
                if(key>max){
                    max = key;
                }

            }
        }
        return max;
    }
}