class Solution {
    public String freqAlphabets(String s) {
        String res="";
        for(int i=s.length()-1;i>=0;i--){
            char tem = s.charAt(i);
            if(tem=='#'){
                int val=(s.charAt(i-2)-'0')*10;
                val+=(s.charAt(i-1)-'0');
                res+=(char)(val+96);
                i-=2;
            }else{
                int val = s.charAt(i)-'0';
                res+=(char)(val+96);
            }
        }
        return new StringBuilder(res).reverse().toString();
    }
}