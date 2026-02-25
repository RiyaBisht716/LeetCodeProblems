class Solution {
    public int[] sortByBits(int[] arr) {
        // Convert int[] to Integer[] for custom sorting
        Integer[] nums = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        Arrays.sort(nums, (a, b) -> {
            int countA = Integer.bitCount(a);
            int countB = Integer.bitCount(b);

            // First sort by number of 1 bits
            if (countA != countB) {
                return countA - countB;
            }

            // If equal, sort by value
            return a - b;
        });

        // Convert back to int[]
        return Arrays.stream(nums).mapToInt(Integer::intValue).toArray();
    }
}