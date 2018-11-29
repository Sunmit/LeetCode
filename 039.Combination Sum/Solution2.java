class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        backTracking(list,new ArrayList(),candidates,target,0);
        return list;
    }
    
    private void backTracking(List<List<Integer>> list,List<Integer> templist,int[] candidates,int target,int idx){
        if(target==0){
            list.add(new ArrayList(templist));
            return;
        }else{
            for(int i =idx;i<candidates.length;i++){
                int candidate = candidates[i];
                if(candidate>target){
                    return;
                }
                templist.add(candidate);
                backTracking(list,new ArrayList(templist),candidates,target-candidate,i);
                templist.remove(templist.size()-1);
                
            }
        }
    }
}
