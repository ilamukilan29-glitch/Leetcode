class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int val = arr.length/20;
        int str=0+val;
        int end=arr.length-val;
        int sum=0;
        for(int i=str;i<end;i++){
            sum+=arr[i];
        }
        return (double) sum/(arr.length-(val*2));

    }
}