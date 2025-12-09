class Solution {
    public int specialTriplets(int[] nums) {
        final int MOD = 1_000_000_007;
        int n = nums.length;

        // rightCounts: frequency of elements to the right of current index
        Map<Integer, Integer> rightCounts = new HashMap<>();
        for (int num : nums) {
            rightCounts.merge(num, 1, Integer::sum);
        }

        // leftCounts: frequency of elements to the left of current index
        Map<Integer, Integer> leftCounts = new HashMap<>();

        long result = 0L;

        // Treat nums[j] as the middle element
        for (int j = 0; j < n; j++) {
            int mid = nums[j];

            // Move current element from right to current (so it's no longer "right")
            rightCounts.put(mid, rightCounts.get(mid) - 1);
            if (rightCounts.get(mid) == 0) {
                rightCounts.remove(mid);
            }

            // We need nums[i] = nums[k] = 2 * mid
            int doubled = mid * 2;

            Integer leftFreq  = leftCounts.get(doubled);   // how many doubles on the left
            Integer rightFreq = rightCounts.get(doubled);  // how many doubles on the right

            if (leftFreq != null && rightFreq != null) {
                result = (result + (long) leftFreq * rightFreq) % MOD;
            }

            // Now include mid in leftCounts for future j's
            leftCounts.merge(mid, 1, Integer::sum);
        }

        return (int) result;
    }
}