class Solution {
    public int balancedStringSplit(String s) {
        int val =0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R')
                val++;
            if(s.charAt(i)=='L')
                val--;
            if(val==0){
                count++;
            }
        }
        return count;
    }
}