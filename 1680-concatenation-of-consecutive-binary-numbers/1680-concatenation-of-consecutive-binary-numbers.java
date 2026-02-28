class Solution {
    public int concatenatedBinary(int n) {
        long result = 0;
        int MOD = 1_000_000_007;
        int bitLength = 0;

        for (int i = 1; i <= n; i++) {

            // increase bit length when i is power of 2
            if ((i & (i - 1)) == 0) {
                bitLength++;
            }

            // shift left and add current number
            result = ((result << bitLength) + i) % MOD;
        }

        return (int) result;
    }
}