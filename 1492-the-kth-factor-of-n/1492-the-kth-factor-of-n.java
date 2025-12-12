class Solution {
    public int kthFactor(int n, int k) {
       int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {   // i is a factor
                count++;
                if (count == k) {
                    return i;   // k-th factor found
                }
            }
        }

        return -1;  // k is larger than total number of factors 
    }
}