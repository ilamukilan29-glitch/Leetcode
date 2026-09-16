class Solution {
    public int oddCells(int m, int n, int[][] mat) {
        int[][] res = new int[m][n];
        for(int i=0;i<mat.length;i++){
          int tem = mat[i][0];
          int tem1= mat[i][1];
          for(int k=0;k<n;k++){
            res[tem][k]++;
          }
          for(int k=0;k<m;k++){
            res[k][tem1]++;
          }
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(res[i][j]%2!=0){
                    count++;
                }
            }
        }
        return count;
        
    }
}