class Solution {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length < 1)
            return -1;
        int lo=0,hi=nums.length-1;
        //找到转折点
        while(lo<hi){
            int mid = (lo+hi)/2;
            if(nums[mid]>nums[hi]){
                lo = mid+1;
            }else{
                hi=mid;
            }
        }
        int rot = lo;
        lo=0;
        hi=nums.length-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            int realmid = (mid+rot)%nums.length;
            if(nums[realmid]==target){
                return realmid;
            }else if (nums[realmid]>target){ 
                hi = mid -1;
            }else {
                lo = mid +1;
            }
        }
        return -1;
    }
    
    
}
