class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1=s.toCharArray();
        char[] s2=t.toCharArray();
        Arrays.sort(s1);Arrays.sort(s2);
        String a1=new String(s1);
        String a2=new String(s2);
        return a1.equals(a2);
    }
}
