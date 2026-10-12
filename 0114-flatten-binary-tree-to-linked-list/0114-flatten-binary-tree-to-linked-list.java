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
    public void flatten(TreeNode root) {
        if(root == null)
            return;
        Stack<TreeNode> st= new Stack<TreeNode>();
        TreeNode c = new TreeNode();
        c= root;
        while(c!=null)
        {
            if(c.right != null)
            {
                st.push(c.right);
            }
            if(c.left!=null)
            {
                c.right = c.left;
                c.left=null;
                c = c.right;
            } 
            else
            {

                c.right = st.isEmpty() ? null : st.pop();
                c = c.right;
            }
        }
        return;
    }
}