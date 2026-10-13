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

    TreeNode prev;
    boolean found;

    public boolean isValidBST(TreeNode root) {

        if(root == null){
            return true;
        }

        if(root.left == null && root.right == null){
            return true;
        }

        found = true;
        prev = null;

        isSorted(root);

        if (found) {
            return true;
        } else {
            return false;
        }
    }

    public void isSorted(TreeNode root) {
        if (root == null) {
            return;  
        }
        isSorted(root.left);
        if (prev == null) {
            prev = root;
        } else {
            if (root.val <= prev.val) {
                found = false;

            }

        }
        prev = root;
        
        isSorted(root.right);

    }

}