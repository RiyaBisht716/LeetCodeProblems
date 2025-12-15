class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for(String s : sentences){
            int count =1; //to count the space
            for(char ch : s.toCharArray()){
                if(ch == ' ')
                count++;
            }
            maxWords = Math.max(maxWords,count);
        }
        return maxWords;
    }
}