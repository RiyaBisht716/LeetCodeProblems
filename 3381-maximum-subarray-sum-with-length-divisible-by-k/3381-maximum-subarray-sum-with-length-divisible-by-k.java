class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long[] minPrefix = new long[k];

        // minPrefix[r] = minimum prefix sum seen at an index i where i % k == r
        Arrays.fill(minPrefix, Long.MAX_VALUE / 4);

        long prefix = 0L;
        long ans = Long.MIN_VALUE;

        // Treat "prefix before index 0" as at index -1, whose (-1 % k) is (k - 1)
        minPrefix[k - 1] = 0L;

        for (int i = 0; i < n; i++) {
            prefix += nums[i];
            int r = i % k;

            // Subarray sum with length divisible by k:
            // prefix(i) - minPrefix[r]
            ans = Math.max(ans, prefix - minPrefix[r]);

            // Update minimum prefix for this remainder class
            if (prefix < minPrefix[r]) {
                minPrefix[r] = prefix;
            }
        }

        return ans;
    }
}