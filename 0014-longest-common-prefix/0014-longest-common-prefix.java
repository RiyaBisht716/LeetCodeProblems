class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();//store the prefix result
        Arrays.sort(strs); //sort the string
        String first = strs[0];
        String last = strs[strs.length -1];
        for(int i=0 ; i< Math.min(first.length(),last.length()) ; i++){
            //stop if character are  different
            if(first.charAt(i)!= last.charAt(i)){
                return sb.toString();
            }
            sb.append(first.charAt(i));
        }
        return sb.toString();
    }
}