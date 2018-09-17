/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution2 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);
        while(!stack.isEmpty()){
            TreeNode rNode = stack.pop();
            TreeNode lNode = stack.pop();
            if(rNode==null&&lNode==null){
                continue;
            }
            if(rNode==null||lNode==null||rNode.val!=lNode.val){
                return false;
            }
            stack.push(lNode.left);
            stack.push(rNode.right);
            stack.push(lNode.right);
            stack.push(rNode.left);
        }
        return true;
    }
}
