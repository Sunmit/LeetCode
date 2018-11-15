class Solution {
    public int divide(int dividend, int divisor) {
        boolean flag = true;
        if((dividend<0&&divisor>0)||(dividend>0&&divisor<0)){
            flag =false;
        }
        
        long ldividend = Math.abs((long)dividend);
        long ldivisor = Math.abs((long)divisor);
        
        int i=1;
        long tmp=ldivisor,lres=0;
        while(ldividend>=ldivisor){
            if(ldividend-tmp>=0){
                ldividend-=tmp;
                lres +=i;
                tmp += ldivisor;
                i++;
            }else{
                ldividend-=ldivisor;
                lres++;
                i=1;
                tmp=ldivisor;
            }
        }
        if(lres>Integer.MAX_VALUE){
            return flag?Integer.MAX_VALUE:Integer.MIN_VALUE;
        }else{
            return flag?(int)lres:(int)-lres;
        }
        
    }
}
