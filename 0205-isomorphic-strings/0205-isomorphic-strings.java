class Solution {
    public boolean isIsomorphic(String s, String t) {
        int num = s.length();
        int [] s1 = new int [256]; //ismai string s ke character ke index store hai
        int [] s2 = new int [256]; //ismai string t ke character ke index store hai

        for(int i = 0;i< num ;i++){
            int c1 = s.charAt(i);
            int c2 = t.charAt(i);
            //if charcter of string s is not match with character at string t
            if(s1[c1] != s2[c2] ) return false;

            //update the index of s1 and s2
            s1[c1] = i+1;
            s2[c2] = i+1; 

        }
        //the strings are consistent and unique
        return true;

    }
}