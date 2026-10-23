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
    public TreeNode result = null;
    public int maxPathSumUtil(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        if(root.left == null && root.right == null)
        {
            result.val = Math.max(result.val,root.val);
            return root.val;
        }
        int left = maxPathSumUtil(root.left);
        int right = maxPathSumUtil(root.right);
        int total = left + right + root.val;
        int ret1 = left + root.val;
        int ret2 = right + root.val;
        result.val = Math.max(result.val,total);
        result.val = Math.max(result.val, ret1);
        result.val = Math.max(result.val, ret2);
        result.val = Math.max(result.val,root.val);

        return Math.max(root.val , Math.max(ret1,ret2));
    }

    public int maxPathSum(TreeNode root) {
        result = new TreeNode(root.val);
        maxPathSumUtil(root);
        return result.val;                
    }
}