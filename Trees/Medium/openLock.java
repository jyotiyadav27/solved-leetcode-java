class Solution {
    public int openLock(String[] deadends, String target) {
        Map<Character, Character> nextSlot = Map.of(
                '0', '1',
                '1', '2',
                '2', '3',
                '3', '4',
                '4', '5',
                '5', '6',
                '6', '7',
                '7', '8',
                '8', '9',
                '9', '0'
        );
        // Map the previous slot digit for each current slot digit.
        Map<Character, Character> prevSlot = Map.of(
                '0', '9',
                '1', '0',
                '2', '1',
                '3', '2',
                '4', '3',
                '5', '4',
                '6', '5',
                '7', '6',
                '8', '7',
                '9', '8'
        );
        Set<String> visited = new HashSet<>(Arrays.asList(deadends));

        if(visited.contains("0000")){
            return -1;
        }
        Queue<String> q = new LinkedList<>();
        q.offer("0000");
        visited.add("0000");
        int turns = 0;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                String current = q.poll();
                if(current.equals(target)){
                    return turns;
                }
                for(int w = 0; w < 4 ; w++){
                    StringBuilder newComb = new StringBuilder(current);
                    newComb.setCharAt(w, nextSlot.get(newComb.charAt(w)));
                    if(!visited.contains(newComb.toString())){
                        q.add(newComb.toString());
                        visited.add(newComb.toString());

                    }

                    newComb = new StringBuilder(current);
                    newComb.setCharAt(w, prevSlot.get(newComb.charAt(w)));
                    if(!visited.contains(newComb.toString())){
                        q.add(newComb.toString());
                        visited.add(newComb.toString());

                    }
                }
            }
            turns += 1;
        }
        return -1;
    }
}