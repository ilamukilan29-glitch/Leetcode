class Solution {
    public long countCommas(long n) {
        if(n<1000){
            return 0;
        }
        if(n<1000000){
            return n-999;
        }
        if(n<1000000000){
            long tem = n-999;
            long tem1 = n-999999;
            return tem+tem1;
        }
        if(n<1000000000000L){
            long tem = n-999;
            long tem1 = n-999999;
            long tem2 = n-999999999L;
            return tem+tem1+tem2;
        }
        
        if(n<=100000000000000L){
            long tem = n-999;
            long tem1 = n-999999;
            long tem2 = n-999999999L;
            long tem3 = n-999999999999L;
           
                return tem+tem1+tem2+tem3;
   
        }
        else{
            long tem = n-999;
            long tem1 = n-999999;
            long tem2 = n-999999999L;
            long tem3 = n-999999999999L;
            long tem4 = n-999999999999999L;
             if(n==1000000000000000L){
                return tem+tem1+tem2+tem3+1;
            }
            return tem+tem1+tem2+tem3;
        }
     
    }
}