class Solution {
    public String reverseWords(String s) {
        String[] st = s.split(" ");
        List<String> l1 = new LinkedList<>();
        for (String str:st){
            StringBuilder s1 = new StringBuilder(str);
            StringBuilder revS1 = s1.reverse();
            l1.add(revS1.toString());
        }
        return String.join(" ",l1);
    }
}