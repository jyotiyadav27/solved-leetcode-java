class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> players = new HashSet<>();
        Map<Integer, Integer> losses = new HashMap<>();

        for(int[] match:matches){
            players.add(match[0]);
            players.add(match[1]);
            losses.put(match[1], losses.getOrDefault(match[1],0)+1);
        }

        List<List<Integer>> ans= Arrays.asList(new ArrayList<>(), new ArrayList<>());
        for (int p:players){
            if(!losses.containsKey(p)){
                ans.get(0).add(p);
            } else if (losses.get(p)==1){
                ans.get(1).add(p);
            }
        }

        Collections.sort(ans.get(0));
        Collections.sort(ans.get(1));
        return ans;
    }

}