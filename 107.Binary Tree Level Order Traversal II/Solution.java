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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ll = new ArrayList<>();
        levelOrderBottom(root,ll,0);
        Collections.reverse(ll);
        return ll;
    }
    
    private void levelOrderBottom(TreeNode root,List<List<Integer>> ll,int level){
        if(root == null){
            return;
        }
        if(ll.size()>level){
            ll.get(level).add(root.val);
        }else{
            List<Integer> l = new ArrayList<>();
            l.add(root.val);
            ll.add(l);
        }
        levelOrderBottom(root.left,ll,level+1);
        levelOrderBottom(root.right,ll,level+1);
    }
}
