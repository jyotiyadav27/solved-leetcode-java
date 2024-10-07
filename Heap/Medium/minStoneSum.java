class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        int sum = 0;
        for(int p : piles){
            heap.add(p);
            sum += p;
        }

        while(k > 0){
            int s = heap.remove();

            heap.add(s - s/2);
            sum -= s/2;
            k--;
        }

        return sum;

    }
}