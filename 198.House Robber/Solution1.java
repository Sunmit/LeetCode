class Solution1 {
    public int rob(int[] nums) {
        int prevNo=0,prevYes=0;
        for(int i=0;i<nums.length;i++){
            int temp = prevNo;
            prevNo = Math.max(prevNo,prevYes);
            prevYes = temp+nums[i];
        }
        return Math.max(prevNo,prevYes);
    }
}
