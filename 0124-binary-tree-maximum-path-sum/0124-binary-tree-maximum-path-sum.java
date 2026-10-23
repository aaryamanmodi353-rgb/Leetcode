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

    int maxSum;

    public int maxPathSumUtil(TreeNode root){
        if(root == null){
            return 0;
        }

       if(root.left == null && root.right == null){
        maxSum = Math.max(root.val, maxSum);
        return root.val;
       }

       int left = maxPathSumUtil(root.left);
       int right = maxPathSumUtil(root.right);
       int total = left + right + root.val;
       int resLeft = left + root.val;
       int resRight = right + root.val;

      

       maxSum = Math.max(total, maxSum);
       maxSum = Math.max(maxSum, Math.max(resLeft, resRight));
       maxSum = Math.max(root.val, maxSum);


       return Math.max(root.val, Math.max(resLeft, resRight));


    }
    public int maxPathSum(TreeNode root) {
        if(root == null){
            return 0;
        }

        maxSum = root.val;

        maxPathSumUtil(root);

        return maxSum;

    

        



        
    }
}