class Solution {
    public int countKDifference(int[] nums, int k) {
         int ans = 0;
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            // For current num, check how many previous numbers form diff k
            ans += freq.getOrDefault(num - k, 0);
            ans += freq.getOrDefault(num + k, 0);

            // Add current number to the frequency map
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        return ans;
    }
}