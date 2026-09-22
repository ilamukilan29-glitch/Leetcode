class Solution {
    public int maxArea(int[] h) {
        int max=0;
        int i=0,j=h.length-1;
        while(i<j){
                int len=j-i;
                int min=(h[i]>h[j])?h[j]:h[i];
                if(max<(min*len)){
                    max=min*len;
                }
                if(h[i]<h[j]){
                    i++;
                }else{
                    j--;
                }
            }
        
        return max;
    }
}