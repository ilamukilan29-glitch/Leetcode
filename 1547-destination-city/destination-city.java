class Solution {
    public String destCity(List<List<String>> paths) {
        for(List<String> pa:paths){
            String val=pa.get(1);
            boolean flag = true;
            for(List<String> va:paths){
                String tem=va.get(0);
                if(tem.equals(val)){
                    flag=false;
                }
            }
            if(flag){
                return val;
            }
        }
        return "hello";
    }
}