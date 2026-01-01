class Solution {
    public String longestPalindrome(String s) {
        //This willl store start and end index of longest palindrome
        int start =0;
        int end =0; 
        //this will take every charcter as a center and check
        for(int center =0;center< s.length();center++){

            int lenOdd = expandFromCenter(s,center,center);
            int lenEven = expandFromCenter(s,center,center+1);
            int maxLen = Math.max(lenOdd,lenEven);
            //update the longest palindrome
            if(maxLen > end -start){
                start = center -(maxLen-1)/2;
                end = center + maxLen/2;
            }
            
        } 
        return s.substring(start,end+1);
    }
        private int expandFromCenter(String s, int left ,int right){
            //check for charcter matching of left and right
            while(left>=0 && right <s.length() && s.charAt(left) == s.charAt(right)){
                left--;
                right++;
            }
            return right -left -1;
        }
        
     
    
}