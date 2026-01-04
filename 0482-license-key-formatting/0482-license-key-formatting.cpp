class Solution {
public:
    string licenseKeyFormatting(string s, int k) {
        string result;
        int count = 0;

        // Traverse from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s[i] == '-') continue;

            // Convert to uppercase
            result.push_back(toupper(s[i]));
            count++;

            // Add dash after k characters
            if (count == k) {
                result.push_back('-');
                count = 0;
            }
        }

        // Remove trailing dash if exists
        if (!result.empty() && result.back() == '-') {
            result.pop_back();
        }

        // Reverse to get correct order
        reverse(result.begin(), result.end());
        return result;
    }
};