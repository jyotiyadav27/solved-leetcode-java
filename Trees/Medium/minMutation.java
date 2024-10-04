class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {
        Set<String> seen = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        q.offer(startGene);
        seen.add(startGene);
        int steps = 0;
        while(!q.isEmpty()){
            int size = q.size();

            for(int j = 0 ; j < size; j++){
                String current = q.poll();
                if(current.equals(endGene)){
                    return steps;
                }
                for(char c : new char[]{'A', 'C', 'G', 'T'}){
                    for(int i = 0; i < current.length(); i++){
                        String nei = current.substring(0,i) + c + current.substring(i+1);
                        if(!seen.contains(nei) && Arrays.asList(bank).contains(nei)){
                            q.add(nei);
                            seen.add(nei);
                        }

                    }
                }

            }
            steps++;
        }
        return -1;
    }
}