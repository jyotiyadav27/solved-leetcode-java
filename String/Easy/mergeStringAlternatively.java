class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l=0;

        String output="";
        while(l<word1.length()&& l<word2.length()){
            output += word1.charAt(l);
            output += word2.charAt(l);
            l++;
        }
        System.out.println(output);
        while(l<word1.length()){
            output += word1.charAt(l);
            l++;
        }
        while(l<word2.length()){
            output += word2.charAt(l);
            l++;
        }
        return output;
    }
}