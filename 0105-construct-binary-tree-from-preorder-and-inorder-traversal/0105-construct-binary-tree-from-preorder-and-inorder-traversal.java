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
    HashMap<Integer, Integer> hmap;

    int indx;

    public TreeNode orderTree(int preorder[], int low, int high){

        if(low > high){
            return null;
        }

        TreeNode node = new TreeNode(preorder[indx]);

        indx++;
        int pos = hmap.get(node.val);
        node.left = orderTree(preorder, low, pos - 1);
        node.right = orderTree(preorder, pos + 1, high);


        return node;

    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        hmap =  new HashMap<>();

        indx = 0;
        
        int i = 0;
        for(i = 0; i < inorder.length; i++){

            hmap.put(inorder[i], i);
        }

        int low = 0;
        int high = preorder.length - 1;

        return orderTree(preorder, low, high);




        
    }
}