class Solution {
    public int maxDepth(String s) {
        int max=0;
        int val=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                val++;
            }
            if(ch==')'){
                if(val>max){
                    max=val;
                }
                val--;
            }
        }
        return max;
    }
}