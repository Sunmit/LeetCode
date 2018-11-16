class Solution {
    public void nextPermutation(int[] nums) {
        if(nums==null||nums.length<=1){
            return;
        }
        int i = nums.length-2;
        while(i>=0&&nums[i]>=nums[i+1]){
            i--;
        }
        
        int j = nums.length-1;
        if(i>=0){
            while(nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        revert(nums,i+1,nums.length-1);
    }
    
    public void revert(int[] nums,int begin,int end){
        while(begin<end){
            swap(nums,begin++,end--);
        }
    }
    
    public void swap(int[] nums,int i,int j){
        int tmp = nums[j];
        nums[j] = nums[i];
        nums[i] = tmp;
    } 
}
