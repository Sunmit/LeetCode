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
    public boolean hasPathSum(TreeNode root, int sum) {
        int tmpsum = 0;
        return pathSum(root,tmpsum,sum)==-1;
    }
    
    private int pathSum(TreeNode node,int tmpsum,int sum){
        if(node==null){
            return 0;
        }
        tmpsum+=node.val;
        int leftSum =  pathSum(node.left,tmpsum,sum);
        int rightSum =  pathSum(node.right,tmpsum,sum);
        if(leftSum==-1||rightSum==-1||leftSum==0&&rightSum==0&&tmpsum==sum){
            return -1;
        }
        return 1;
    }
    
}
