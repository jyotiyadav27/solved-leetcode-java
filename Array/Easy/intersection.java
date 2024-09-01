class Solution {
    public List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int[] arr:nums)
            for(int a: arr)
                m.put(a, m.getOrDefault(a,0)+1);
        int n=nums.length;
        List<Integer> l = new ArrayList<>();
        for(int key:m.keySet()){
            if(m.get(key)==n){
                l.add(key);
            }

        }
        Collections.sort(l);
        return l;
    }
}
