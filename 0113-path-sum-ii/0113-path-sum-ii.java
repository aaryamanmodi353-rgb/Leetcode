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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        List<Integer> temp = new ArrayList<>();
        int sum = 0;

        equalSum(root, targetSum, sum, temp, res);

        return res;
        

        

        
    }

    public void equalSum(TreeNode root, int targetSum, int sum, List<Integer> temp, List<List<Integer>> res){

        if(root == null){
            return;
        }

        temp.add(root.val);
        sum += root.val;

        if(root.left == null && root.right == null){
             if(sum == targetSum){
                res.add(new ArrayList<>(temp));
               
             }
             
        }
        

        equalSum(root.left, targetSum, sum, temp, res);
        equalSum(root.right, targetSum, sum, temp, res);
        temp.remove(temp.size() - 1);
    }
}