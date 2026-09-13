class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] res = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] mon ={3,0,3,2,3,2,3,3,2,3,2,3};
        int[] mon1 ={3,1,3,2,3,2,3,3,2,3,2,3};
        boolean isleap = false;
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    isleap=true;
                }
            }else{
                isleap=true;
            }
        }
        int val=4;
        int tem = year-1971;
        int leap=(year - 1) / 4
                 - (year - 1) / 100
                 + (year - 1) / 400
                 - (1970 / 4)
                 + (1970 / 100)
                 - (1970 / 400);
        val+=(leap*2)+(tem-leap);

        if(isleap){
            for(int i=0;i<month-1;i++){
                val+=mon1[i];
            }
        }else{
             for(int i=0;i<month-1;i++){
                val+=mon[i];
            }
        }
        val+=day;
        val%=7;
        return res[val];

    }
}