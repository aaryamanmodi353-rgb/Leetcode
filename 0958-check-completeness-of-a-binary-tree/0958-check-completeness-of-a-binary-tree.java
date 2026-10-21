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
    public boolean isCompleteTree(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();

        if(root == null){
            return true;
        }

        boolean found = false;

        q.add(root);

        while(!q.isEmpty()){

            TreeNode front = q.poll();

            if(front == null){
                found = true;
            }
           
           else {
            if(front != null && found == true){
                return false;
            }

              q.add(front.left);
            q.add(front.right);

          
           }
        }


        return true;



        
        
    }
}