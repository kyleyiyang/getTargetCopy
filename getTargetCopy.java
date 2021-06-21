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
    TreeNode ans;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        ans=cloned;
        dfs(original,cloned,target);
        return ans;
    }
    public void dfs(TreeNode o, TreeNode c, TreeNode target) {
        if (o==null) return;
        if (o.val==target.val) {ans= c;return;}
        dfs(o.left,c.left,target);
        dfs(o.right,c.right,target);
    }
}
