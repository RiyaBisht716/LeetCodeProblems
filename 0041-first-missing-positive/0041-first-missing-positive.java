class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Put each number in its correct position (1 at index 0, 2 at index 1, ...)
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        // Find the first index that's not correct
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // If all are correct, the next positive number is n + 1
        return n + 1;
      
    
    }
}