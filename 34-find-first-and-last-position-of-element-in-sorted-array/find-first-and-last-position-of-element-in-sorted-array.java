class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};
        res[0] = startend(nums, target, true);
        if(res[0]!=-1){
             res[1] = startend(nums, target, false);
        }
        return res;  
    }
    static int startend(int[] arr, int target, boolean isStart){
        int res=-1;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                res=mid;
                if(isStart){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return res;
    }
}