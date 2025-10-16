class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;  // sqrt(0)=0, sqrt(1)=1

        int left = 1, right = x / 2;
        int ans = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2; // use long to prevent overflow
            long sq = mid * mid;

            if (sq == x) {
                return (int) mid; // exact square root
            } else if (sq < x) {
                ans = (int) mid; // possible answer, move right
                left = (int) mid + 1;
            } else {
                right = (int) mid - 1; // move left
            }
        }
        return ans;
        
    }
}