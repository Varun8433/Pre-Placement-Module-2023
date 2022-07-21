class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);
        int min = s.length();
        for(Map.Entry<Character, Integer> hm : map.entrySet())
            if(hm.getValue() == 1)
                min = Math.min(min, s.indexOf(hm.getKey()));
        return min == s.length() ? -1 : min;    
    }
}