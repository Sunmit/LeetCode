class Solution {
    public String convertToTitle(int n) {
        StringBuffer sb = new StringBuffer();
        while(n>0){
            int i = n%26;
            char c;
            if(i==0){
                c = 'Z';
                n--;
            }else{
                c = (char)('A'+i-1);
            }
            sb.insert(0,c);
            n/=26;
        }
        return sb.toString();
    }
}
