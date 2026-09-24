class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> output = new HashMap<>();
        for(String s:strs){
            int[] freq = new int[26];
            for(int i=0;i<s.length();i++){
            char jc = s.charAt(i);
            freq[jc - 'a']++;
            }
            String sortedS = Arrays.toString(freq);
            output.putIfAbsent(sortedS,new ArrayList<>());
            output.get(sortedS).add(s);
        }
        
        
        return new ArrayList<>(output.values());
    }
}
