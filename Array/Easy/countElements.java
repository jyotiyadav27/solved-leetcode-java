class Solution {
    public int countElements(int[] arr) {
        Set<Integer> s = new HashSet<>();
        int count =0;
        for(int n:arr){
            s.add(n);

        }
        for(int n:arr){
            if(s.contains(n+1)){
                count++;
            }
        }

        return count;
    }
}