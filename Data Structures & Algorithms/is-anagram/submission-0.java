class Solution {
    public boolean isAnagram(String s, String t) {
        char[] j = s.toCharArray();
        char[] c = t.toCharArray();
        Arrays.sort(j);
        Arrays.sort(c);
        return (Arrays.equals(j,c));

    }
}
