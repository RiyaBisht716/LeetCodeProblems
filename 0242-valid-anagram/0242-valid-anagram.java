class Solution {
    // public boolean isAnagram(String s, String t) {
    //     int s1 = s.length();
    //     int t1 = t.length();

    //     if(s1 != t1) return false;

    //     int [] freq =  new int[26];

    //     for(int i=0;i<s1;i++){
    //         freq[s.charAt(i) -'a']++;
    //         freq[t.charAt(i)-'a']--;
    //     }

    //     for(int x : freq){
    //         if(x != 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
      public boolean isAnagram(String s, String t){
        char [] s1 = s.toCharArray();
        char [] t1 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(t1);

        return Arrays.equals(s1,t1);
      }

    
}