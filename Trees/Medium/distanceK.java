/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    Map<TreeNode, TreeNode> parents = new HashMap<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        dfs(root, null);
        Queue<TreeNode> q = new LinkedList<>();
        Set<TreeNode> seen = new HashSet<>();
        q.add(target);
        seen.add(target);
        int distance = 0;
        while(!q.isEmpty() && distance < k){
            int level = q.size();
            for(int i = 0; i < level; i++){
                TreeNode node = q.remove();
                for(TreeNode n : new TreeNode[]{node.left, node.right, parents.get(node)}){
                    if(n != null && !seen.contains(n)){
                        seen.add(n);
                        q.add(n);
                    }
                }
            }
            distance++;
        }

        List<Integer> ans = new ArrayList<>();
        for (TreeNode node: q) {
            ans.add(node.val);
        }

        return ans;
    }
    public void dfs(TreeNode node, TreeNode parent){
        if(node == null){
            return;
        }
        parents.put(node, parent);
        dfs(node.left, node);
        dfs(node.right, node);

    }
}