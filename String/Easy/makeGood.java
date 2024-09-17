class Solution {
    public String makeGood(String s) {
        StringBuilder stack = new StringBuilder();
        for(char c: s.toCharArray()){
            if(stack.length()>0 && stack.charAt(stack.length()-1) != c && Character.toLowerCase(c) == Character.toLowerCase(stack.charAt(stack.length()-1))){
                stack.deleteCharAt(stack.length()-1);
            } else {
                stack.append(c);
            }

        }
        return stack.toString();
    }
}