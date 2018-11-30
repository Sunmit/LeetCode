class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        boolean[] used = new boolean[candidates.length];
        backtracking(list,new ArrayList(),candidates,target,0,used);
        return list;
    }
    
    private void backtracking(List<List<Integer>> list,List<Integer> templist,int[] candidates, int target,int idx,boolean[] used){
        if(target==0){
            list.add(new ArrayList(templist));
            return;
        }
        for(int i=idx;i<candidates.length;i++){
            if(candidates[i]>target){
                return;
            }
            if(used[i]||(i>0&&candidates[i-1]==candidates[i]&&!used[i-1])){
                continue;
            }
            
            templist.add(candidates[i]);
            used[i] = true;
            backtracking(list,templist,candidates,target-candidates[i],i,used);
            used[i] = false;
            templist.remove(templist.size()-1);
        }
    }
}
