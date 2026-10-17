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
    TreeNode ans;
    int maxSize;
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        if(root == null){
            return root;
        }
        ans = null;
        maxSize = 0;

        int totalSum = lca(root, 0);

        return ans;
        
    }

    public int lca(TreeNode root, int currSize){
        if(root == null){
            return currSize - 1;
        }

        maxSize = Math.max(currSize, maxSize);

        int leftNode = lca(root.left, currSize + 1);
        int rightNode = lca(root.right, currSize + 1);

        if(leftNode == maxSize && rightNode == maxSize){
            ans = root;

        }

        return Math.max(leftNode, rightNode);
        
    }
}