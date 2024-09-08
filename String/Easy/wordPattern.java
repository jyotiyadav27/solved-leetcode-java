class Solution {
    public boolean wordPattern(String pattern, String s) {

        int pL = pattern.length();
        String[] sS = s.split(" ");
        int sL = sS.length;
        if(pL != sL){
            return false;
        }
        Map<Character, String> mP = new HashMap<>();
        Map<String, Character> mS = new HashMap<>();

        for(int i =0; i<pL; i++){
            String charS =sS[i];
            char charP = pattern.charAt(i);
            if (mP.containsKey(charP)){

                if(!(mP.get(charP)).equals(charS)){
                    return false;
                }
            }
            mP.put(charP,charS);
        }

        for(int i =0; i<sL; i++){
            String charS =sS[i];
            char charP = pattern.charAt(i);
            if (mS.containsKey(charS)){
                if(mS.get(charS) != charP){
                    return false;
                }
            }

            mS.put(charS,charP);
        }
        return true;
    }
}