class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String res1="";
        String res2="";
        for(String word:word1){
            res1+=word;
        }
        for(String word:word2){
            res2+=word;
        }
        if(res1.equals(res2)){
            return true;
        }
        return false;
    }
}