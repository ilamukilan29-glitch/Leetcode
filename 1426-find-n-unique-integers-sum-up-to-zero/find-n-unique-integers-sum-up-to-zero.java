class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int i=0;
        int val=1;
        while(n>i){
            if(i%2==0){
                arr[i]=val;
               
            }else{
                arr[i]=-val;
                val++;
            }
            i++;
        }
        if(n%2!=0){
            arr[n-1]=0;
        }
        return arr;
    }
}