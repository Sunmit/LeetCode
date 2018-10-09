class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){//nums[i]为第一个数，后面至少有2个数
            if(i==0||(i>0&&nums[i]!=nums[i-1])){ //避免重复数组  如[-1,-1,0,1,2]
                int sum = 0-nums[i];
                int lo = i+1,hi = nums.length-1;
                while(lo<hi){
                    if(nums[i]+nums[lo]+nums[hi]==0){
                        res.add(Arrays.asList(nums[i],nums[lo],nums[hi]));
                        while(lo<hi&&nums[lo]==nums[lo+1]) lo++; //避免重复数字
                        while(lo<hi&&nums[hi]==nums[hi-1]) hi--;
                        lo++;
                        hi--;
                    }else if(nums[i]+nums[lo]+nums[hi]<0){
                        lo++;
                    }else{
                        hi--;
                    }
                }
            }
        }
        return res;
    }
}
