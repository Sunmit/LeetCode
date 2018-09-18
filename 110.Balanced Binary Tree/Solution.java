/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Flag{
    boolean val;
    Flag(boolean val){
        this.val = val;
    }
}
class Solution {
    public boolean isBalanced(TreeNode root) {
        Flag flag = new Flag(true);
        treeHeight(root,flag);
        return flag.val;
    }
    
    private int treeHeight(TreeNode node,Flag flag){
        if(!flag.val||node == null){
            return 0;
        }
        int leftheigth = treeHeight(node.left,flag);
        int rightheigth = treeHeight(node.right,flag);
        if(Math.abs(leftheigth-rightheigth)>1){
            flag.val = false;
        }
        return Math.max(leftheigth,rightheigth)+1;
    }
}
