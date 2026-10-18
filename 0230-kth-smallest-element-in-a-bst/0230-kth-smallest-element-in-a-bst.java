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

    public int kthSmallestUtil(TreeNode root,int k,TreeNode temp)
    {
        if(root == null)
            return -1;
        int left = kthSmallestUtil(root.left,k,temp);
        if(left != -1)
            return left;
        if(temp.val == k)
        {
            return root.val;
        }
        temp.val++;
        int right = kthSmallestUtil(root.right,k,temp);
        return right;
    }
    public int kthSmallest(TreeNode root, int k) {
        TreeNode temp = new TreeNode(1);
        return kthSmallestUtil(root,k,temp);
    }
}