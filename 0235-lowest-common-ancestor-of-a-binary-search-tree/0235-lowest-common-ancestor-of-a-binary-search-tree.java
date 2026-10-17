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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root == null){
            return root;
        }
        ans = null;
        int totalSum = 0;
        
        if(p.val < q.val){
          totalSum = lca(root, p, q);
        }
        else{
            totalSum = lca(root, q, p);

        }


        return ans;



        
    }


    public int lca(TreeNode root, TreeNode p, TreeNode q){
        if(root == null){
            return 0;
        }

        int left = lca(root.left, p, q);
        int right = lca(root.right, q, p);
        int self = 0;

        if(root == p || root == q){
            self = 1;
        }

        int totalSum = left + right + self;
        if(totalSum == 2 && ans == null){
            ans = root;
        }

        return totalSum;

    }
}