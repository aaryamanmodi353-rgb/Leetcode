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

    public void isSorted(TreeNode root){
        if(root == null){
            return;
        }

        isSorted(root.left);
        
        if(prev == null){
            prev = root;
        }

        else{
            if(root.val <= prev.val){
                found = false;
                return;
            }
        }
        prev = root;

        isSorted(root.right);

    }
    public boolean isValidBST(TreeNode root) {

        if(root == null){
            return true;
        }

        prev = null;
        found = true;

        isSorted(root);

        return found;

        
        
    }
}