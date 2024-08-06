//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
// and removing all non-alphanumeric characters,
//it reads the same forward and backward. Alphanumeric characters include letters and numbers.


class Solution {
    public boolean isPalindrome(String s) {
        s = s.toUpperCase();
        s = s.replaceAll("[^A-Za-z0-9]", "");
        int low = 0;
        int high = s.length()-1;
        while(low<high){
            if(s.charAt(low)!=s.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}