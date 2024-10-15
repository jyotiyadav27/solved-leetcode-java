class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n,0) + 1);
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>((n1,n2)-> map.get(n1) - map.get(n2));
        for(int num: map.keySet()){
            heap.add(num);
            if(heap.size() > k){
                heap.remove();
            }
        }
        int[] ans = new int[k];
        for(int i = 0; i < k; i++){
            ans[i] = heap.remove();
        }
        return ans;
    }
}