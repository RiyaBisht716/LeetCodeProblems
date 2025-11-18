class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
         List<Integer> result = new ArrayList<>();

        for (int n = left; n <= right; n++) {
            if (isSelfDividing(n)) {
                result.add(n);
            }
        }
        return result;
    }

    private boolean isSelfDividing(int num) {
        int original = num;

        while (num > 0) {
            int digit = num % 10;

            // digit cannot be zero, and must divide the number
            if (digit == 0 || original % digit != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}