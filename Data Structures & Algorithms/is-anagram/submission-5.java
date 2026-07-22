class Solution {
    public boolean isAnagram(String s, String t) {
        
        Map<Character,Integer> countS = new HashMap<>();
        Map<Character,Integer> countT = new HashMap<>();

        int len = 0;

        if(s.length()!=t.length()){
            return false;
        }

        while(len<t.length()){
            countS.put(s.charAt(len),countS.getOrDefault(s.charAt(len),0)+1);
            countT.put(t.charAt(len),countT.getOrDefault(t.charAt(len),0)+1);
            
            len++;
        }
        len = 0;
        while (len<t.length()){
            if(!countS.containsKey(t.charAt(len))){
                return false;
            }
            else if(!countS.get(t.charAt(len)).equals(countT.get(t.charAt(len)))){
                return false;
            }
            len++;
        }

        // for (Map.Entry<Character, Integer> entry : countS.entrySet()) {
        //     if(entry.getKey()!=0){
        //         return false;
        //     }
        // };

        return true;
    }
}
