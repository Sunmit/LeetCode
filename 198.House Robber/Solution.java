class Solution {
    public int rob(int[] nums) {
        int[] mem = new int[nums.length];
        for(int i=0;i<mem.length;i++){
            mem[i]=-1;
        }
        return rob(nums,mem,nums.length-1);
    }
    
    private int rob(int[] nums,int[] mem,int n ){
        if(n<0){
            return 0;
        }
        if(mem[n]>=0){
            return mem[n];
        }
        mem[n] = Math.max((rob(nums,mem,n-2)+nums[n]),rob(nums,mem,n-1));
        return mem[n];
    }
}
