class Solution {
    public int nthUglyNumber(int n) {
        int[] ugly = new int[n];
        ugly[0] = 1;  // first ugly number

        int i2 = 0, i3 = 0, i5 = 0;  // pointers
        int next2 = 2, next3 = 3, next5 = 5;

        for (int i = 1; i < n; i++) {
            int next = Math.min(next2, Math.min(next3, next5));
            ugly[i] = next;

            // Move pointers forward for whichever was chosen
            if (next == next2) i2++;
            if (next == next3) i3++;
            if (next == next5) i5++;

            // Update next multiples
            next2 = ugly[i2] * 2;
            next3 = ugly[i3] * 3;
            next5 = ugly[i5] * 5;
        }

        return ugly[n - 1];
    
    }
}