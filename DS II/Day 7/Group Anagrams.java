class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        return new ArrayList<>(
            List.of(strs).parallelStream()
                    .collect(Collectors.groupingBy(Solution::toKey))
                    .values());
    }
    
    public static String toKey(String s) {
        char[] chars = s.toCharArray(); 
        Arrays.sort(chars); 
        return new String(chars); 
    }
}