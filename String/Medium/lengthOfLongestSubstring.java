class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> m = new HashSet<>();
        int right=0, left=0;
        int ans =0;
        for(right =0; right<s.length(); right++){
            if(!m.contains(s.charAt(right))){

                m.add(s.charAt(right));
                ans = Math.max(ans, right-left+1);

            }
            else{
                while(m.contains(s.charAt(right))){
                    m.remove(s.charAt(left));
                    left++;
                }
                m.add(s.charAt(right));
            }

        }
        return ans;

    }
}