class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null||"".equals(s)){
            return 0;
        }
        int maxlen =1,i=0,j=1;
        while(i<s.length()&&j<s.length()){
            if(s.substring(i,j).indexOf(s.charAt(j))<0){
                if(maxlen < j-i+1){
                    maxlen = j-i+1;
                }
            }else{
                i = s.indexOf(s.charAt(j),i)+1;
            }
            j++;
        }
        return maxlen;
    }
}
