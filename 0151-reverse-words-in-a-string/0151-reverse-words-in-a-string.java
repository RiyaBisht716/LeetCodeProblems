class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();//to reverse the words
        for(int i = words.length -1;i>=0;i--){
            sb.append(words[i]);
            if (i != 0) sb.append(" ");//give space only between two words not before

        }
        
        return sb.toString();
    }
}