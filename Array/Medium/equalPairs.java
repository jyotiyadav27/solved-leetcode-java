import java.util.*;
class Solution {
    public int equalPairs(int[][] grid){
        Map<String, Integer> m = new HashMap<>();

        for(int[] n:grid){
            String s = Arrays.toString(n);
            System.out.println(s);
            m.put(s, m.getOrDefault(s,0)+1);
        }
        int ans =0;
        int n = grid.length;
        for(int i = 0; i<n; i++)
        {   int[] c = new int[n];
            for(int j =0; j<n; j++){
                c[j]=grid[j][i];
                System.out.println(c[j]);
            }
            String c1 = Arrays.toString(c);
            System.out.println(c1);
            if(m.containsKey(c1)){
                ans = ans + m.get(c1);
            }
        }
        return ans;
    }
}