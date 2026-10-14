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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        
        List<List<Integer>> res = new ArrayList<>();

        if(root != null){
            q.add(root);
        }

        int count = 1;

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
                    
        if(count % 2 == 0){
            Collections.reverse(lst);
        }
         

          res.add(new ArrayList<>(lst));

          count++;
            
        }

        return res;
        
    }
}