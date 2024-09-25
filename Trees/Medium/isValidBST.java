
class Solution {
    public boolean dfs(TreeNode node, Integer low, Integer high){
        if(node == null){
            return true;
        }
        if((low != null && node.val <= low) ||
                (high != null && node.val >= high)){
            return false;
        }

        return (dfs(node.right, node.val, high) && dfs(node.left, low, node.val));

    }
    public boolean isValidBST(TreeNode root) {
        return dfs(root, null, null);
    }
}