/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode ans;

    public void lca(TreeNode root, TreeNode p, TreeNode q){
        if(root == null){
            return;
        }

        if(root.val < p.val){
            lca(root.right, p, q);
        }
        if(root.val > q.val){
            lca(root.left, p, q);
        }

        if(root.val == p.val || root.val == q.val){
            ans = root;
            return;
        }

        if(p.val <= root.val && root.val <= q.val){
            ans = root;
            return;
        }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root == null){
            return root;
        }

        ans = null;
        
        if(p.val < q.val){
             lca(root, p, q);
        }
        else{
            lca(root, q, p);
        }

        return ans;
    }
}