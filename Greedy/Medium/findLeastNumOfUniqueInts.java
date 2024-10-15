class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int a: arr){
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        List<Integer> freq = new ArrayList<>(map.values());
        Collections.sort(freq);
        int eR = 0;
        for(int i = 0; i < freq.size(); i++){
            eR += freq.get(i);

            if(eR > k){
                return freq.size() - i;
            }
        }
        return 0;
    }
}