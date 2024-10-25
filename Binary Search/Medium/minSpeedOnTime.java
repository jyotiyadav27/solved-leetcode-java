class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        if (dist.length > Math.ceil(hour)) {
            return -1;
        }
        int l = 1;
        int r = (int) Math.pow(10, 7);
        while(l < r){
            int mid = l + (r - l)/2;
            if(enough(dist, hour, mid)){
                r = mid;
            } else l = mid + 1;
        }
        return l;
    }


    public boolean enough(int[] dist, double hour, int mid){
        double t = 0;
        for(double d: dist){
            t = Math.ceil(t);
            t += d / mid;
        }
        return t <= hour;
    }
}