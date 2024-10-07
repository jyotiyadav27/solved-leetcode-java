class Solution {
    int[] a;
    public boolean canReach(int[] arr, int start) {
        a = arr;
        boolean[] visited = new boolean[arr.length];
        return reach(start, visited);
    }
    public boolean reach(int index, boolean[] visited){
        if(index < 0 || index >= a.length) return false;
        if(visited[index]) return false;
        if(a[index] == 0) return true;
        visited[index] = true;
        return reach(index + a[index], visited) || reach(index - a[index], visited);

    }
}
