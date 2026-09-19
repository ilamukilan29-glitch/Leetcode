class Solution {
    public int busyStudent(int[] str, int[] end, int q) {
        int count=0;
        for(int i=0;i<str.length;i++){
            if(str[i]<=q && end[i]>=q){
                count++;
            }
        }
        return count;
    }
}