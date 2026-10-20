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
    int minSize;

public int lca(TreeNode root, int currSize){

    if(root == null){
        return Integer.MAX_VALUE;
    }

    if(root.left == null && root.right == null){
        return currSize + 1;
    }
    
    int left = lca(root.left, currSize + 1);
    int right = lca(root.right, currSize + 1);

    return Math.min(left, right);

}

    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;

        }

       return lca(root, 0);

    }
}