class Solution {
    public int[] shuffle(int[] nu, int n) {
        int[] res = new int[nu.length];
        int val=0;
        for(int i=0;i<nu.length;i++){
            if(i%2==0){
                 res[i]=nu[val];
                 
            }else{
                 res[i]=nu[val+n];
                 val++;
            }
        }
        return res;
    }
}