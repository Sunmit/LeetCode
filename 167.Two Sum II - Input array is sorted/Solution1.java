class Solution1 {
    public int[] twoSum(int[] numbers, int target) {
        int[] ints = new int[2];
        int len = numbers.length;
        int i=0,idx2 = len-1;
        while(numbers[i]+numbers[idx2]!=target){
            idx2 = bs(numbers,i+1,idx2,target-numbers[i]);
            if(numbers[i]+numbers[idx2]!=target){
                i++;
            }
        }
        ints[0]=i+1;
        ints[1]=idx2+1;
        return ints;
    }
    
    private int bs(int[] numbers,int begin,int end,int target){
        if(begin==end){
            return begin;
        }
        int mid = (begin+end)/2;
        if(numbers[mid]<target){
            return bs(numbers,mid+1,end,target);
        }else{
            return bs(numbers,begin,mid,target);
        }
    }
}
