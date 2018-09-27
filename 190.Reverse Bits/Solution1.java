public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result=0;
        //一共32位，遍历
        for(int i=0;i<32;i++){
            //右移 如果最右边位数为1，存入result左边对应位
            if(((n>>i)&1)==1){
                int j =31-i;
                result |= 1<<j;
            }
        }
        return result;
    }
}
