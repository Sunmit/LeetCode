class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        deepTrack(list,"",0,0,n);
        return list;
    }
    
    private void deepTrack(List list,String str,int begin,int end,int max){
        if(str.length()==max*2){
            list.add(str);
            return;
        }
        if(begin<max){
            deepTrack(list,str+"(",begin+1,end,max);
        }
        if(end<begin){
            deepTrack(list,str+")",begin,end+1,max);
        }
    }
}
