class Solution {
public:
    bool hasAlternatingBits(int n) {
        unsigned int x = n ^ (n>>1); //xor with right always give all 1 's it means the bits are alternative
        return (x & (x+1)) == 0; //checking all bits are 1's
        
    } 
};