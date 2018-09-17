/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 /**
 * implement for recursive
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return check(root.left,root.right);
    }
    
    private boolean check (TreeNode left,TreeNode right){
        if(left==null&&right==null){
            return true;
        }else if(left==null||right==null){
            return false;
        }else{
            if(left.val==right.val){
                return check(left.left,right.right)&&check(left.right,right.left);
            }else{
                return false;
            }
        }
    }
}
