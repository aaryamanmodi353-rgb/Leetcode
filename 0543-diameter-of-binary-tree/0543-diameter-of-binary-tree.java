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
    int totalSum;

    public int lca(TreeNode root){
        if(root == null){
            return 0;
        }


       int left = lca(root.left);
       int right = lca(root.right);
       int sum = left + right;
       totalSum = Math.max(sum, totalSum);

       return Math.max(left, right) + 1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }

        totalSum  = 0;

         lca(root);


        return totalSum;

        
    }
}