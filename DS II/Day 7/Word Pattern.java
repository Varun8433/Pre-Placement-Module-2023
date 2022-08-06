class Solution {
public boolean wordPattern(String pattern, String s) {
//code here

    String []str = s.split(" ");
    
    HashMap<Character, String> h = new HashMap<>();
    
    HashSet<String> h1 = new HashSet<>();
    
    if(pattern.length() != str.length){
        return false;
    }
    for(int i=0; i<pattern.length(); i++){
        if(h.containsKey(pattern.charAt(i)) && !Objects.equals(h.get(pattern.charAt(i)), str[i])){
            return false;
        }else{
            if(!h.containsKey(pattern.charAt(i)) && h1.contains(str[i])){
                return false;
            }
            
            h.put(pattern.charAt(i), str[i]);
            h1.add(str[i]);
        }
    }
    return true;
}
}