class Solution {
    public int[] finalPrices(int[] p) {
        for(int i=0;i<p.length;i++){
            int tem=0;
            for(int j=i+1;j<p.length;j++){
                if(p[i]>=p[j]){
                    tem=p[j];
                    break;
                }
            }
            p[i]-=tem;
        }
        return p;
    }
}