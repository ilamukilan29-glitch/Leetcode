class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>(); 
        int min=arr[1]-arr[0];
        for(int i=1;i<arr.length;i++){
          if((arr[i]-arr[i-1])<min){
            min=arr[i]-arr[i-1];
          }
        }
        for(int i=1;i<arr.length;i++){
            if((arr[i]-arr[i-1])==min){
                List<Integer> lst = new ArrayList<>();
                lst.add(arr[i-1]);
                lst.add(arr[i]);
                list.add(lst);
            }
        }
        return list;
    }
}