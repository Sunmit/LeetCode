class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ll = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer> l = new ArrayList<>();
            l.add(1);
            for(int j = 0; j<i;j++){
                if(j==0||j==i-1){
                    l.add(1);
                }else{
                    l.add(ll.get(i-2).get(j-1)+ll.get(i-2).get(j));
                }
            }
            ll.add(l);
        }
        return ll;
    }
}
