class Solution2 {
    public String convert(String s, int numRows) {
        StringBuffer[] sbs = new StringBuffer[numRows];
        for(int i=0;i<numRows;i++){
            sbs[i] = new StringBuffer();
        }
        int i=0;
        while(i<s.length()){
            for(int idx=0;idx<numRows&&i<s.length();idx++){
                sbs[idx].append(s.charAt(i++));
            }
            for(int idx=numRows-2;idx>0&&i<s.length();idx--){
                sbs[idx].append(s.charAt(i++));
            }
        }
        for(int idx=1;idx<numRows;idx++){
            sbs[0].append(sbs[idx]);
        }
        return sbs[0].toString();
    }
}
