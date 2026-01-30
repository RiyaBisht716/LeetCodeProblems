class Solution {
public:
    bool isAnagram(string s, string t) {
        sort(begin(s),end(s)); 
        sort(begin(t),end(t)); 
        // sort(s.begin(),s.end());
        return t==s;
    }
};