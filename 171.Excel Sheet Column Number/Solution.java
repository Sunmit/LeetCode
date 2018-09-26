class Solution {
    public int titleToNumber(String s) {
        int num=0;
        int len =s.length();
        for(int i=0;i<len;i++){
            char c = s.charAt(i);
            num= num+((int)Math.pow(26,len-i-1))*(c-'A'+1);
        }
        return num;
    }
}
