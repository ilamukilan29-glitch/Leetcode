class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
       
        int k=0;
        for(int i=0;i<arr2.length;i++){
            for(int j=k;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    int tem = arr1[k];
                    arr1[k]=arr1[j];
                    arr1[j]=tem;
                    k++;
                }
            }
        }
        Arrays.sort(arr1,k,arr1.length);
        return arr1;
    }
}