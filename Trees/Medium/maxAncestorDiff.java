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
    public int dfs(TreeNode node, int min, int max){
        if(node == null){
            return (max-min);
        }
        min = Math.min(min,node.val);
        max = Math.max(max, node.val);
        int leftMin = dfs(node.left, min, max);
        int rightMin = dfs(node.right, min, max);
        return Math.max(Math.max(leftMin, rightMin), Math.abs(max - node.val));


    }
    public int maxAncestorDiff(TreeNode root) {
        return dfs(root, root.val, root.val);
    }
}