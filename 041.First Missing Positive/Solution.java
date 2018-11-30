class Solution {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        if(len==0){
            return 1;
        }
        for(int i=0;i<len;i++){
            //attention here use while not if
            while(nums[i]>0&&nums[i]<len&&nums[i]!=nums[nums[i]-1]){
                swap(nums,i,nums[i]-1);
            }
        }
        for(int i=0;i<len;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return len+1;
    }
    
    private void swap(int[] nums,int i,int j){
        if(nums[i]!=nums[j]){
            nums[i] ^= nums[j];
            nums[j] ^= nums[i];
            nums[i] ^= nums[j];
        }
    }
}
