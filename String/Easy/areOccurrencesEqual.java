class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> m = new HashMap<>();
        for(char st:s.toCharArray()){
            m.put(st, m.getOrDefault(st,0)+1);
        }
        Set<Integer> s1 = new HashSet<>(m.values());
        return s1.size()==1;
    }
}
