class Solution {
    public String multiply(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        int[] pos = new int[len1+len2];
        for(int i=len1-1;i>=0;i--){
            for(int j=len2-1;j>=0;j--){
                int mul = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                int sum = pos[i+j+1]+mul;
                pos[i+j+1]=sum%10;
                pos[i+j] +=sum/10;
            }
        }
        StringBuffer sb = new StringBuffer();
        for(int po :pos){
            if(sb.length()!=0||po!=0){
                sb.append(po);
            }
        }
        return sb.length()==0?"0":sb.toString();
    }
        
}
