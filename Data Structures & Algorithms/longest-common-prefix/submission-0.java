class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length<2){
            return strs[0];
        }
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];

        String lcp = "";

        for(int i=0;i<first.length();i++){
            if(first.charAt(i)==last.charAt(i)){
                lcp+=first.charAt(i);
            }
            else{
                break;
            }
        }
        return lcp;
    }
}