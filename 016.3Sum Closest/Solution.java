class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++){
            if(i==0||(i>0&&(nums[i]!=nums[i-1]))){
                int lo=i+1,hi=nums.length-1;
                while(lo<hi){
                    int sum = nums[i]+nums[lo]+nums[hi];
                    closestSum = (Math.abs(target-closestSum)>Math.abs(target-sum))?sum:closestSum;
                    if(sum==target){
                        return target;
                    }else if(sum<target){
                        lo++;
                    }else{
                        hi--;
                    }
                }
            }
        }
        return closestSum;
    }
}
