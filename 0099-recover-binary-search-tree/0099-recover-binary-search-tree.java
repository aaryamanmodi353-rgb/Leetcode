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
    TreeNode p;
    TreeNode q;
    TreeNode r;
    TreeNode s;
    int count;
    public void recoverTree(TreeNode root) {

        prev = null;
        p = null;
        q = null;
        r = null;
        s = null;
        count = 0;

        isSortTree(root);

        if(count == 1){
            int temp = p.val;
            p.val = q.val;
            q.val = temp;
        }
        else{

            int temp = p.val;
            p.val = s.val;
            s.val = temp;


        }


        
        
       
        
    }

    void isSortTree(TreeNode root){

        if(root == null){
            return;
        }

        isSortTree(root.left);

        
        if(prev == null){
            prev = root;
        }
        else{
            if(root.val < prev.val){
                if(count == 0){
                    p = prev;
                    q = root;
                    count++;
                }
                else{
                    r = prev;
                    s = root;
                    count++;
                }
            }
        }
        prev = root;

        isSortTree(root.right);
        

        
    }
}