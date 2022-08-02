class Solution {
    //O(26) -> constant time.
    public boolean isEqualFrequency(int []s, int p[]){
        for(int i = 0; i< 26; i++){
            if(s[i] != p[i]){
                return false;
            }
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
       if(s.length() < p.length()){
            return new ArrayList<>();
        }
        
        int sFreq[] = new int[26];
        int pFreq[] = new int[26];
        List<Integer> ans = new ArrayList<>();
        int windowLen = p.length();
        
        for(int i = 0; i < windowLen; i++){
             sFreq[s.charAt(i) - 'a']++;
             pFreq[p.charAt(i) - 'a']++;
        } 
        
        if(isEqualFrequency(sFreq, pFreq)){
            ans.add(0);
        }
        
        //O(26*n) -> O(n) linear complexity
        for(int i = windowLen; i< s.length(); i++){
            sFreq[s.charAt(i - windowLen) - 'a']--;
            sFreq[s.charAt(i) - 'a']++;
            //Constant time 26 comparison.
            if(isEqualFrequency(sFreq, pFreq)){
                ans.add(i-windowLen+1);
            }
        }
        
        return ans;
        
        
    }
}