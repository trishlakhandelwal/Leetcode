class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        else
        {
            //convert strings to Character Arrays
            char arr1[] = s.toCharArray();
            char arr2[] = t.toCharArray();
            //sort the arrays
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            //convert array to string
            String str1 = String.valueOf(arr1);
            String str2 = String.valueOf(arr2);
            //check if the strings are equal
            return (str1.equals(str2));
        }
        
    }
}