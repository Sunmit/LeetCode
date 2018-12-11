class Solution {
    public String multiply(String num1, String num2) {
        if("0".equals(num1)||"0".equals(num2)){
            return "0";
        }
        StringBuffer[] sbs= new StringBuffer[num2.length()];
        StringBuffer ans = new StringBuffer();
        int maxLen =0;
        for(int i=num2.length()-1;i>=0;i--){
            sbs[i] = new StringBuffer();
            int no2 = num2.charAt(i)-'0';
            if(no2==0){
                continue;
            }
            for(int k=num2.length()-1-i ;k>0;k--){
                sbs[i].append(0);
            }
            int jin =0;
            for(int j=num1.length()-1;j>=0;j--){
                int no1 = num1.charAt(j)-'0';
                int mul = no1*no2+jin;
                sbs[i].append((mul%10));
                jin = mul/10;
            }
            if(jin!=0){
                sbs[i].append(jin);
            }
            maxLen = Math.max(maxLen,sbs[i].length());
        }
        int jin =0;
        for(int i=0;i<maxLen;i++){
            int temp =jin;
            for(StringBuffer sb:sbs){
                if(sb.length()>i){
                    temp += (sb.charAt(i)-'0');
                }
            }
            ans.append(temp%10);
            jin = temp/10;
        }
        if(jin!=0){
            ans.append(jin);
        }
        return ans.reverse().toString();
    }
}
