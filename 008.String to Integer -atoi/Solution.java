class Solution {
    public int myAtoi(String str) {
        if(str.length()==0){
            return 0;
        }
        int sign =1,total=0,index=0;
        while(index < str.length()&&str.charAt(index)==' '){
            index++;
        }
        if(index < str.length()&&(str.charAt(index)=='+'||str.charAt(index)=='-')){
            sign = str.charAt(index++)=='+'?1:-1;
        }
        for(int i=index;i<str.length();i++){
            if(!Character.isDigit(str.charAt(i))){
                break;
            }
            int digit = Character.getNumericValue(str.charAt(i));
            if(Integer.MAX_VALUE/10<total||Integer.MAX_VALUE/10==total&&Integer.MAX_VALUE%10<digit){
                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            total = total*10+digit;
        }
        return total*sign;
    }
}
