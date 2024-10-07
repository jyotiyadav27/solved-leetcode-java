
class Solution {
    public int connectSticks(int[] sticks) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int s: sticks){
            heap.add(s);
        }
        int sum = 0;
        while(heap.size() > 1){
            int x = heap.remove();
            int y = heap.remove();
            heap.add(x+y);
            sum += x + y;
        }
        return sum;
    }
}