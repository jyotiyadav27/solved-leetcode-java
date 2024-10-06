class Solution {
    Set<String> words;
    int steps = 1;
    Queue<String> q = new LinkedList<>();

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        words = new HashSet<>(wordList);
        q.offer(beginWord);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                String curr = q.poll();
                for(int j = 0; j < curr.length(); j++){
                    for(char c ='a'; c <= 'z'; c++){
                        String newS = curr.substring(0, j) + c + curr.substring (j+1);
                        if(words.contains(newS)){
                            if(newS.equals(endWord)) return steps + 1;
                            words.remove(newS);
                            q.offer(newS);
                        }
                    }
                }

            }
            steps++;
            System.out.println(steps);
        }
        return 0;
    }
}