class Solution {
    public int jump(int[] nums) {
        int curfastest=0,curend=0,jumps=0;
        for(int i=0;i<nums.length-1;i++){
            curfastest = Math.max(curfastest,i+nums[i]);//在i位置能到达最远距离
            if(i==curend){
                jumps++;
                curend = curfastest;
            }
        }
        return jumps;
    }
}
