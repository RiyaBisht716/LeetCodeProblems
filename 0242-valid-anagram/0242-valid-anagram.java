class Solution {
    public boolean isAnagram(String s, String t) {
        //check the length of both strings
        if(s.length() != t.length()) return false;

        int [] freq = new int[26];

        //count the frequency in string s
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;

        }
        //decrement the frequency in string t
        for(int i=0;i<t.length();i++){
            freq[t.charAt(i) -'a']--;
        }

        for(int i =0;i<26;i++){
            if (freq[i]!=0){
                return false;
            }
        }
        //the strings are anagram
        return true;


    }
}