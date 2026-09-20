class Solution {
    public int reverseDegree(String s) {
        int res=0;
        for(int i=0;i<s.length();i++){
            int tem = s.charAt(i)-'0';
            int val = tem-48; 
            int tem1 = 27-val;
            res+=((tem1)*(i+1));
        }
        return res;
    }
}