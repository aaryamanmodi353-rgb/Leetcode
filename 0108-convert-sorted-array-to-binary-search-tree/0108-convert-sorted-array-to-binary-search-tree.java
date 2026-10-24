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

    public TreeNode orderTree(int nums[], int low, int high){
        if(low > high){
            return null;
        }
        int p = (low + high) / 2;

        TreeNode node =  new TreeNode(nums[p]);
        node.left = orderTree(nums, low, p - 1);
        node.right = orderTree(nums, p + 1, high);
        return node;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0){
            return null;
        }

        return orderTree(nums, 0, nums.length -1);


    }
}