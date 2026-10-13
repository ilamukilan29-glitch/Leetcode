class Solution {
    public int xorOperation(int n, int start) {
        int res = start;
        int val = start;
        for(int i=1;i<n;i++){
            val+=2;
            res^=val;
        }
        return res;
    }
}