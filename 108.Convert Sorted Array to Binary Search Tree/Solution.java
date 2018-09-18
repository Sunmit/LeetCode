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
    public TreeNode sortedArrayToBST(int[] nums) {
        //注意nums.length 如果nums.length-1 则最后一个元素永远取不到
        return sortedArrayToBST(nums,0,nums.length);
    }
    
    private TreeNode sortedArrayToBST(int[] nums,int begin,int end){
        //如果begin==end 则[]会报错
        if(begin>=end){
            return null;
        }
        int mid = (begin+end)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayToBST(nums,begin,mid);
        node.right = sortedArrayToBST(nums,mid+1,end);
        return node;
    }
}
