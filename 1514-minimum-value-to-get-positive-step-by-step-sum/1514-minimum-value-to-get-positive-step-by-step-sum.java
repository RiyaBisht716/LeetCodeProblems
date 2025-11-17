class Solution {
    public int minStartValue(int[] nums) {
         int prefixSum = 0;
        int minPrefix = 0; // track the minimum prefix sum

        for (int num : nums) {
            prefixSum += num;
            minPrefix = Math.min(minPrefix, prefixSum);
        }

        // We need startValue + minPrefix >= 1  -> startValue >= 1 - minPrefix
        return 1 - minPrefix;
    }
}