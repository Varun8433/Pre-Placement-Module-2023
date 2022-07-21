class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length())
            return false;
        HashMap<Character,Integer> map =new HashMap<>();
        for (int i=0; i<ransomNote.length(); i++) 
            if(map.containsKey(ransomNote.charAt(i)))
            {
                int count = map.get(ransomNote.charAt(i));
                map.put(ransomNote.charAt(i),++count);
            }
            else
                map.put(ransomNote.charAt(i),1);
        for(int i=0; i<magazine.length(); i++) 
            if(map.containsKey(magazine.charAt(i)))
            {
                int count = map.get(magazine.charAt(i));
                map.put(magazine.charAt(i),--count);
            }
        for (int i=0; i<ransomNote.length(); i++) 
            if(map.get(ransomNote.charAt(i))>0)
                return false;
        return true;    
    }
}