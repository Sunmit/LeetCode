class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        if(words==null||words.length==0||s==null||"".equals(s)){
            return res;
        }
        
        int wordlen = words[0].length();
        int wordarrlen = words.length;
        Map<String,Integer> wordMap = new HashMap<>();
        for(String word:words){
            if(wordMap.containsKey(word)){
                Integer val =wordMap.get(word)+1;
                wordMap.put(word,val);
            }else{
                wordMap.put(word,1);
            }
        }
        for(int i=0;i<s.length()-wordlen*wordarrlen+1;i++){
            int j = i;
            Map<String,Integer> subWordMap = new HashMap<>();
            while(j<i+wordlen*wordarrlen&&wordMap.containsKey(s.substring(j,j+wordlen))){
                String subword = s.substring(j,j+wordlen);
                if(subWordMap.containsKey(subword)){
                    Integer val =subWordMap.get(subword)+1;
                    subWordMap.put(subword,val);
                }else{
                    subWordMap.put(subword,1);
                }
                j+=wordlen;
            }
            if(subWordMap.size()==wordMap.size()){
                boolean flag =true;
                for(Map.Entry<String,Integer> entry:wordMap.entrySet()){
                    if(!subWordMap.containsKey(entry.getKey())||subWordMap.get(entry.getKey())!=entry.getValue()){
                        flag=false;
                    }
                }
                if(flag){
                    res.add(i);
                }       
                
            }
        }
        return res;
    }
}
