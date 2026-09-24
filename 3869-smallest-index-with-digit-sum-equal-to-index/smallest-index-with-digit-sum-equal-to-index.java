class Solution {
    static int sum(int n){
        int count=0;
        while(n>0){
            int tem = n%10;
            count+=tem;
            n/=10;
        }
        return count;
    }
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(sum(nums[i])==i){
                return i;
            }
        }
        return -1;
    }
}