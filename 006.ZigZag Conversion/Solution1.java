class Solution {
    public String convert(String s, int numRows) {
        char[][] xn = new char[s.length()][numRows];
        StringBuffer sb = new StringBuffer();
        boolean flag=false;
        for(int i=0,x=0,y=0;i<s.length();i++){
            xn[x][y]=s.charAt(i);
            if(y==0){
                flag=false;
            }
            if(y==numRows-1){
                flag=true;
            }
            if(!flag){
                y++;
            }else{
                x++;
                if(y>0){
                    y--;
                }
            }
        }
        for(int i=0;i<numRows;i++){
            for(int j = 0;j<s.length();j++){
                if(xn[j][i]>0){
                    sb.append(xn[j][i]);
                }
            }
        }
        return sb.toString();
    }
}
