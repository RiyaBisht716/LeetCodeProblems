class Solution {
public:
    vector<string> ans;
    void backtrack(string curr, int n){
        //base case 
        if(curr.size() == n){
            ans.push_back(curr);
            return;
        }


        for(char ch: {'a','b','c'}){
            if(curr.empty() || curr.back() != ch){
                backtrack(curr+ ch, n);
            }
        }
    }
    string getHappyString(int n, int k) {
        backtrack("",n);
        if( k > ans.size()){
            return "";
        }
        return ans[k-1];        
    }
};