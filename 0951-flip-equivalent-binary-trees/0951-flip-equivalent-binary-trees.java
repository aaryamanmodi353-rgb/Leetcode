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

    public TreeNode invertTreeRoot(TreeNode root){
        if(root == null){
            return null;
        }

        TreeNode leftNode = invertTreeRoot(root.left);
        TreeNode rightNode = invertTreeRoot(root.right);

        root.left = rightNode;
        root.right = leftNode;

        return root;
    }
    
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {

        invertTreeRoot(root1);

        if(root1 == null && root2 == null){
            return true;
        }

        if(root1 == null || root2 == null){
            return false;
        }

        if(root1.val != root2.val){
            return false;
        }

       return flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right) || flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left);
        
    }
}