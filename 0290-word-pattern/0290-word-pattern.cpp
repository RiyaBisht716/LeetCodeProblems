class Solution {
public:
    bool wordPattern(string pattern, string s) {
        //split the string into words
        vector<string> words;
        stringstream ss(s);
        string w;

        while(ss >> w){
            words.push_back(w);
        }

        if (pattern.length() != words.size()) return false;


        int pIndex [256] ={0}; //pattern char -last index
        unordered_map<string,int> wIndex; //word -last index

        for(int i=0;i<pattern.length();i++){
            int ch = pattern[i];
            string word = words[i];
            //agar last index match nhi hua 
            if(pIndex[ch] != wIndex[word]) return false;
            
            //update the last index 
            pIndex[ch] = i+1;
            wIndex[word] = i+1;

        }
        return true;
    }
};