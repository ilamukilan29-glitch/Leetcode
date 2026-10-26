class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] res = new int[code.length];
        if(k==0){
            return res;
        }
        if(k<0){
             for(int i=0;i<code.length;i++){
                int sum=0;
                 int in = i-1;
                for(int l=0;l<Math.abs(k);l++){
                   
                    if(0>in){
                        in=code.length-1;
                    }
                    sum+=code[in];
                    in--;
                }
                res[i]=sum; 
                }
                
            }
        else{
            for(int i=0;i<code.length;i++){
                int sum=0;
                 int in = i+1;
                for(int l=0;l<k;l++){
                   
                    if((code.length-1)<in){
                        in=0;
                    }
                    sum+=code[in];
                    in++;
                }
                res[i]=sum; 
                }
                
            }
             return res;
        }
}
       
    
