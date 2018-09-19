class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> preRow = new ArrayList<>();
        preRow.add(1);
        if(rowIndex==0){
            return preRow;
        }
       
        for(int rowNum =0;rowNum<rowIndex;rowNum++){
            List<Integer> currRow = new ArrayList<>();
            currRow.add(1);
            for(int j =0;j<rowNum;j++){
                currRow.add(preRow.get(j)+preRow.get(j+1));
            }
            currRow.add(1);
            preRow = currRow;
        }
        
        return preRow;
    }
}
