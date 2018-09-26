class Solution2 {
    public int majorityElement(int[] nums) {
        int count=1,num=nums[0];
        for(int i=1;i<nums.length;i++){
            if(count==0){
                count++;
                num = nums[i];
            }else if(num==nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return num;
    }
}
