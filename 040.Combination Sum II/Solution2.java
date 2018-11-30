class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        backtracking(list,new ArrayList(),candidates,target,0);
        return list;
    }
    
    private void backtracking(List<List<Integer>> list,List<Integer> templist,int[] candidates, int target,int idx){
        if(target==0){
            list.add(new ArrayList(templist));
            return;
        }
        for(int i=idx;i<candidates.length;i++){
            if(candidates[i]>target){
                return;
            }
            if(i>idx&&candidates[i-1]==candidates[i]){
                continue;
            }
            
            templist.add(candidates[i]);
            backtracking(list,templist,candidates,target-candidates[i],i+1);
            templist.remove(templist.size()-1);
        }
    }
}
