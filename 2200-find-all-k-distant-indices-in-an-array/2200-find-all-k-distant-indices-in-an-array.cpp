class Solution {
public:
    vector<int> findKDistantIndices(vector<int>& nums, int key, int k) {
        vector<int> keyIndices;
        vector<int> result;

        //  Collect all indices where nums[j] == key
        for (int i = 0; i < nums.size(); i++) {
            if (nums[i] == key)
                keyIndices.push_back(i);
        }

        //  Check each index i
        for (int i = 0; i < nums.size(); i++) {
            for (int j : keyIndices) {
                if (abs(i - j) <= k) {
                    result.push_back(i);
                    break;
                }
            }
        }

        return result;
    }
};