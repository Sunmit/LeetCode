class Solution {
    public List<String> letterCombinations(String digits) {
        String[] map = new String[]{"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> res = new LinkedList<>();
        if(digits.isEmpty()){
            return res;
        }
        res.add("");
        for(int i=0;i<digits.length();i++){
            String chars = map[Character.getNumericValue(digits.charAt(i))];
            while(res.get(0).length()==i){
                String str = res.remove(0);
                for(char c:chars.toCharArray()){
                    res.add(str+c);
                }
            }
        }
        return res;
    }
}
