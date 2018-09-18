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
    public boolean isBalanced(TreeNode root) {
        int val = traverse(root);
        return val >= 0;
    }
    
    public int traverse(TreeNode node) {
        
        if (node == null) {
            return 0;
        }
        
        
        int left = traverse(node.left);
        int right = traverse(node.right);
        
        if (left == - 1 || right == -1) {
            return -1;
        } else if (Math.abs(left - right) <= 1) {
            return Math.max(left, right) + 1;
        } else {
            return -1;
        }
    }
}
