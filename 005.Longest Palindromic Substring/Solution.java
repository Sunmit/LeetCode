class Solution {
    private int lo,maxLen;
    public String longestPalindrome(String s) {
        for(int i=0;i<s.length();i++){
            palindrome(s,i,i);
            palindrome(s,i,i+1);
        }
        return s.substring(lo,lo+maxLen);
    }
    
    private void palindrome(String s,int begin,int end){
        while(begin>=0&&end<s.length()&&s.charAt(begin)==s.charAt(end)){
            begin--;
            end++;
        }
        if(maxLen<end-begin-1){
            lo = begin+1;
            maxLen = end-begin-1;
        }
    }
}
