class Solution {
    public boolean isMatch(String s, String p) {
        int sidx=0,pidx=0,match=0,startidx=-1;
        while(sidx<s.length()){
           if(pidx<p.length()&&(p.charAt(pidx)=='?'||p.charAt(pidx)==s.charAt(sidx))){
               pidx++;
               sidx++;
           } else if(pidx<p.length()&&p.charAt(pidx)=='*'){
               match = sidx;
               startidx = pidx;
               pidx++;
           } else if(startidx!=-1){
               pidx = startidx+1;
               match++;
               sidx =match;
           } else {
               return false;
           }
        }
        
        while(pidx<p.length()&&p.charAt(pidx)=='*'){
            pidx++;
        }
        
        return pidx==p.length();
    }
}
