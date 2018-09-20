class Solution1 {
    public int maxProfit(int[] prices) {
        if(prices==null||prices.length==0){
            return 0;
        }
        int low = prices[0],high=0,sum=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<high&&high>low){
                sum += high-low;
                low = prices[i];
                high = 0;
            }else if(low>prices[i]){
                low = prices[i];
                high = 0;
            }else {
                high = Math.max(high,prices[i]);
            }
        }
        if(high>low){
            sum += high-low;
        }
        return sum;
    }
}
