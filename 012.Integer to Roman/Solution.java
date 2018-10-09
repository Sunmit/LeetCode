class Solution {
    public String intToRoman(int num) {
        int[] romanInt = new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanStr = new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<romanInt.length;i++){
            while(num>=romanInt[i]){
                sb.append(romanStr[i]);
                num -= romanInt[i];
            }
        }
        return sb.toString();
    }
}
