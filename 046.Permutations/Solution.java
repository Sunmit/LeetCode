class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtracking(list,new ArrayList(),nums);
        return list;
    }
    
    private void backtracking(List<List<Integer>> list,List<Integer> tempList,int[] nums){
        if(tempList.size()==nums.length){ //已将全部数选出，满足条件加入结果集，结束递归
            list.add(new ArrayList(tempList));
        }else {
            for(int i=0;i<nums.length;i++){
                if(tempList.contains(nums[i])) continue;  // 已经选过的数不再选
                tempList.add(nums[i]);  //选择当前节点
                backtracking(list,tempList,nums);  //递归
                tempList.remove(tempList.size()-1);  //去掉当前节点，返回上一步
            }
        }
    }
}
