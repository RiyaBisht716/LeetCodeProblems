class Solution {
public:
    int mostWordsFound(vector<string>& sentences) {
        int maxWord =0;
        for(string s: sentences){
            int cnt = 1; //to count the spaces in a sentence
            for(char c : s){
                if(c == ' ' ){
                    cnt++;
                }
            }
             maxWord = max(maxWord,cnt);
        }
        return maxWord;
    }
    
};