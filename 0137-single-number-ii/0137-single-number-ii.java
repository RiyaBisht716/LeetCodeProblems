class Solution {
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;

    for (int num : nums) {
        ones = (ones ^ num) & ~twos; // bits appearing 1 time modulo 3
        twos = (twos ^ num) & ~ones; // bits appearing 2 times modulo 3
    }

    return ones; // holds the unique number
    }
}