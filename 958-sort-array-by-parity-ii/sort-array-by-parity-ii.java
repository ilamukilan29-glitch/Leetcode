class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(!((nums[i]%2)==(i%2))){
                 for(int j=i;j<nums.length;j++){
                    if((nums[j]%2)==(i%2)){
                        int tem = nums[i];
                        nums[i]=nums[j];
                        nums[j]=tem;
                        break;
                    }
                }
            }
           
        }
        return nums;
    }
}