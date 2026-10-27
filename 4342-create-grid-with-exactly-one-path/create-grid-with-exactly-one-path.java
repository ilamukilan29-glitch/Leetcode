class Solution {
    public String[] createGrid(int m, int n) {
        String[] res = new String[m];
        for(int i=0;i<m;i++){
            String s = "";
            for(int j=0;j<n;j++){
                if(j==0 || i==m-1){
                    s+=".";
                }else{
                   s+="#"; 
                }
                
            }
            res[i]=s;
        }

    return res;

    }
}