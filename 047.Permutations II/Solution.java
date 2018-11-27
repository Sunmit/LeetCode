class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list =new ArrayList<>();
        Arrays.sort(nums);
        backtracking(list,new ArrayList<>(),nums,new boolean[nums.length]);
        return list;
    }
    
    private void backtracking(List<List<Integer>> list,List<Integer> tempList,int[] nums,boolean[] used){
        if(tempList.size()==nums.length){
            list.add(new ArrayList(tempList));
            return;
        }
        for(int i=0;i<nums.length;i++){
            //当前元素已使用过或者 前一个元素与当前元素相同且前一个元素未使用过（前一个元素未使用过说明已递归过，防止重复，当前元素不参与递归） 跳过
            if(used[i]||i>0&&nums[i]==nums[i-1]&&!used[i-1]) continue;
            tempList.add(nums[i]);
            used[i] = true;
            backtracking(list,tempList,nums,used);
            //回溯到上一步，去除当前节点
            used[i] = false;
            tempList.remove(tempList.size()-1);
        }
    }
}
