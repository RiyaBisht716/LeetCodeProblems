class Solution {
    public boolean hasAlternatingBits(int n) {
        int x = n ^(n>>1);// xor with n will result all bit ones mean alternative bits exist
        return  (x &(x+1)) == 0; // check the bit is ones or not
        
    }
}