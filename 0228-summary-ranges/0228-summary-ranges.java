class Solution {
    public List<String> summaryRanges(int[] nums) {
         List<String> result = new ArrayList<>();

        int n = nums.length;
        if (n == 0) return result;

        for (int i = 0; i < n; i++) {
            int start = nums[i];

            // extend range while consecutive
            while (i + 1 < n && nums[i + 1] == nums[i] + 1) {
                i++;
            }

            int end = nums[i];

            // add range
            if (start == end) {
                result.add(String.valueOf(start));
            } else {
                result.add(start + "->" + end);
            }
        }

        return result;
    }
}