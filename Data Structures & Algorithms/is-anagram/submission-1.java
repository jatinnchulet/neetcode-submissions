class Solution {
    public boolean isAnagram(String s, String t) {
      int[] freq = new int[26];
      int[] freq1 = new int[26];
      for(int i=0;i<s.length();i++){
        char jc = s.charAt(i);
        freq[jc - 'a']++;
      }
      for(int j=0;j<t.length();j++){
        char jc1 = t.charAt(j);
        freq1[jc1 - 'a']++;
      }
      return Arrays.equals(freq,freq1);

    }
}
