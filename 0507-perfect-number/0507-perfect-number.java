class Solution {
    public boolean checkPerfectNumber(int num) {
        // Base check
        if (num <= 1) return false;

        int sum = 1; // 1 is always a divisor

        // Check all divisors up to sqrt(num)
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                // Add the paired divisor (avoid double-counting perfect squares)
                if (i != num / i) sum += num / i;
            }
        }

        return sum == num;
        
    }
}