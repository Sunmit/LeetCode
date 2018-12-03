class Solution {
    public int trap(int[] height) {
        if(height==null||height.length==0){
            return 0;
        }
        int ans =0,len =height.length;
        int[] maxLeftArr = new int[len];
        int[] maxRightArr = new int[len];
        maxLeftArr[0] = height[0];
        for(int i=1;i<len;i++){
            maxLeftArr[i] = Math.max(maxLeftArr[i-1],height[i]);
        }
        maxRightArr[len-1] = height[len-1];
        for(int i=len-2;i>=0;i--){
            maxRightArr[i] = Math.max(maxRightArr[i+1],height[i]);
        }
        for(int i=1;i<len-1;i++){
            ans += Math.min(maxRightArr[i],maxLeftArr[i])-height[i];
        }
        return ans;
    }
}
