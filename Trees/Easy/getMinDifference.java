/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> a = new ArrayList<>();
    int minDifference = Integer.MAX_VALUE;
    public void dfs(TreeNode node){
        if(node == null){
            return;
        }
        dfs(node.left);
        a.add(node.val);
        dfs(node.right);
    }
    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        for(int i = 1; i < a.size(); i++){
            minDifference = Math.min(minDifference, a.get(i) - a.get(i-1));
        }
        return minDifference;
    }
}