class Solution {
    public int maxDepth(String s) {
        int p =0;
        int result =0;
        for(char ch: s.toCharArray()){
            if(ch == '(') p++;

            else  if(ch == ')') p--;
            result = Math.max(result,p);
        }
        return result;
    }
}