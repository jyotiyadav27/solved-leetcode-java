class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());

        for(int s: stones){
            heap.add(s);
        }
        while(heap.size() > 1){
            int x = heap.remove();
            int y = heap.remove();

            if( x != y){
                heap.add(x-y);
            }
        }
        return heap.isEmpty() ? 0: heap.remove();
    }
}