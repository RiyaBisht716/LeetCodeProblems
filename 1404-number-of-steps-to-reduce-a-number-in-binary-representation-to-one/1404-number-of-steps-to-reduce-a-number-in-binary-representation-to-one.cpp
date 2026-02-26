class Solution {
public:
    int numSteps(string s) {
          int steps = 0;
        int carry = 0;

        // Start from rightmost bit except first
        for (int i = s.size() - 1; i > 0; i--) {

            // current bit after carry
            int bit = (s[i] - '0') + carry;

            // if odd
            if (bit % 2 == 1) {
                steps += 2; // +1 then divide by 2
                carry = 1;
            } 
            // if even
            else {
                steps += 1; // only divide by 2
            }
        }

        // if carry remains at MSB
        return steps + carry;
    }
};