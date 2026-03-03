class Solution {
public:
    char findKthBit(int n, int k) {
        if (n == 1) return '0';

        int middle = 1 << (n - 1);  // 2^(n-1)

        if (k == middle)
            return '1';
        
        if (k < middle)
            return findKthBit(n - 1, k);
        
        return findKthBit(n - 1, 2 * middle - k) == '0' ? '1' : '0';
    }
};