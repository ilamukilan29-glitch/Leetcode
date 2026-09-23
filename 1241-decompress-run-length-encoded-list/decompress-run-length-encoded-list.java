class Solution {
    public int[] decompressRLElist(int[] nums) {
      int count=0;
      for(int i=0;i<nums.length;i+=2){
        count+=nums[i];
      }  
      int[] res = new int[count];
      int val=0;
      for(int i=0;i<nums.length;i+=2){
        int k=nums[i];
        for(int j=0;j<k;j++){
            res[val]=nums[i+1];
            val++;
        }
      }
        return res;
    }
}