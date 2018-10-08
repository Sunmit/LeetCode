class Solution2 {
    public int maxArea(int[] height) {
        int maxAera =0,left = 0,right = height.length-1;
        while(left<right){
            maxAera = Math.max(maxAera,Math.min(height[left],height[right])*(right-left));
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxAera;
    }
}
