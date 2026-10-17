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
    Stack<TreeNode> asc;
    Stack<TreeNode> des;


    public TreeNode getSmall(){
        
        if(asc.isEmpty()){
            return null;
        }

        TreeNode front =  asc.peek();
        asc.pop();
   
        TreeNode rightNode = front.right;
        while(rightNode != null){
             asc.add(rightNode);
             rightNode = rightNode.left;

        
        
    }

        return front;

    }

    public TreeNode getBig(){
        if(des.isEmpty()){
            return null;
        }

        TreeNode front = des.peek();
        des.pop();
        
        TreeNode leftNode = front.left;
        while(leftNode != null){
            des.add(leftNode);
            leftNode = leftNode.right;
        }
        

        return front;
    }
    


    public boolean findTarget(TreeNode root, int k) {

        if(root == null){
            return false;
        }
        
        asc = new Stack<>();
        des = new Stack<>();

        TreeNode curr = root;

        while(curr != null){
            asc.add(curr);
            curr = curr.left;
           
        }

        curr = root;

        while(curr != null){
            des.add(curr);
            curr = curr.right;
        }

        TreeNode a = getSmall();
        TreeNode b = getBig();

        while(a != null && b != null && a != b && a.val <= b.val){

            if(a.val + b.val == k){
                return true;
            }
            else if(a.val + b.val < k){
              a = getSmall();
            }
            else{
                b = getBig();
            }
        }

        return false;
        
        
    }
}