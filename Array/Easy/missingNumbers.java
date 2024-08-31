class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int element : nums) {
            s.add(element);
        }
        int n= nums.length;
        for(int i=0; i<=n; i++){
            if(!s.contains(i)){
                return i;
            }
        }
        return -1;
    }
}