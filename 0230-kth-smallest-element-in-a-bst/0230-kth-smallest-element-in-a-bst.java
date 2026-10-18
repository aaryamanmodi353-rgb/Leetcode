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
    PriorityQueue<TreeNode> pq;

    public void inorder(TreeNode root, int k){
        if(root == null){
            return;
        }
        inorder(root.left, k);
        pq.add(root);
        if(pq.size() > k){
            pq.poll();
        }
        inorder(root.right, k);
    }

    
    public int kthSmallest(TreeNode root, int k) {

       pq = new PriorityQueue<>((a, b) -> Integer.compare(b.val, a.val));
       

       inorder(root, k);

       return pq.poll().val;


    }
}