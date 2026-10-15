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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        List<List<Integer>> res = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();

        if(root != null){
            q.add(root);
        }

        while(!q.isEmpty()){
            int size = q.size();
            

            List<Integer> lst = new ArrayList<>();

            while(size > 0){
                TreeNode p = q.poll();
                lst.add(p.val);

                if(p.left != null){
                    q.add(p.left);
                }
                if(p.right != null){
                    q.add(p.right);
                }

                size--;
            }

            res.add(new ArrayList<>(lst));

            
        }

        Collections.reverse(res);

        return res;

        
    }
}