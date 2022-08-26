class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        s = "";
        for(int i = str.length()-1; i>=0; i--)
        {
            s = s + str.charAt(i);
        }
        return str.equals(s);
    }
}