class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        backTracking(list,new ArrayList(),candidates,target,0,0);
        return list;
    }
    
    private void backTracking(List<List<Integer>> list,List<Integer> templist,int[] candidates,int target,int idx,int sum){
        if(sum==target){
            list.add(new ArrayList(templist));
            return;
        }else if(sum>target||idx>=candidates.length){
            return;
        }else{
            int candidate = candidates[idx];
            templist.add(candidate);
            sum+=candidate;
            backTracking(list,new ArrayList(templist),candidates,target,idx,sum);
            idx++;
            if(idx<candidates.length){                
                templist.remove(templist.size()-1);
                sum-=candidate;
                backTracking(list,new ArrayList(templist),candidates,target,idx,sum);
            }

        }
    }
}
