class Solution {
    
    public boolean canJump(int[] nums) {
        int curfastest = nums[0];
        for(int i=0;i<=curfastest&&i<nums.length;i++){
            curfastest = Math.max(curfastest,i+nums[i]);
        }
        return curfastest>=nums.length-1;
    }
}
