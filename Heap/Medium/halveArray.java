class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> heap = new PriorityQueue<>(Comparator.reverseOrder());
        double target = 0;
        int ans =0;
        for(double n : nums){
            target += n;
            heap.add(n);
        }

        target /= 2;
        while(target > 0){
            double x = heap.remove();
            ans++;
            target -= x/2;
            heap.add(x/2);
        }
        return ans;
    }
}