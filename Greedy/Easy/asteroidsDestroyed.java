class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long curMass = mass;
        for(int a: asteroids){
            if(curMass < a) return false;
            curMass += a;
        }
        return true;
    }
}