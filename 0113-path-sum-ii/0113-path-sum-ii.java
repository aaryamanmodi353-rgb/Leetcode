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
        int sum = 0;
        

        equalSum(root, targetSum, new ArrayList<Integer>(), res, sum);
        return res;

        
        
    }

    public void equalSum(TreeNode root, int targetSum, List<Integer>temp, List<List<Integer>> res,int sum){

        if(root == null){
            return;
        }
        temp.add(root.val);
        sum += root.val;

        if(root.left == null && root.right == null){
            if(sum == targetSum){
                res.add(new ArrayList(temp));
            }
            
            
           
        }
         
        
        equalSum(root.left, targetSum, temp, res, sum);
        equalSum(root.right, targetSum, temp, res, sum);
        temp.remove(temp.size()-1);
        


    }
}