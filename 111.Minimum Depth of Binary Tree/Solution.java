/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftLevel = minDepth(root.left);
        int rightLevel = minDepth(root.right);
        if(leftLevel==0||rightLevel==0){
            return Math.max(leftLevel,rightLevel)+1;
        }else{
            return Math.min(leftLevel,rightLevel)+1;
        }
    }
  
}
