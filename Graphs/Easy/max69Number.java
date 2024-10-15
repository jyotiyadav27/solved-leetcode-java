class Solution {
    public int maximum69Number (int num) {
        StringBuilder newNum = new StringBuilder();
        newNum.append(num);
        for(int i = 0; i < newNum.length(); i++){
            if(newNum.charAt(i) == '6'){
                newNum.setCharAt(i,'9');
                break;
            }
        }
        return Integer.parseInt(newNum.toString());

    }
}