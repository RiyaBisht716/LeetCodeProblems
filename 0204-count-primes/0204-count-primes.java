class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;

        BitSet isPrime = new BitSet(n);
        isPrime.set(2, n, true);  // set all from 2 to n-1 as true

        int limit = (int) Math.sqrt(n);
        for (int i = 2; i <= limit; i++) {
            if (isPrime.get(i)) {
                // Clear multiples of i starting at i*i
                for (int j = i * i; j < n; j += i) {
                    isPrime.clear(j);
                }
            }
        }

        // Count bits that are still true
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime.get(i)) count++;
        }
        return count;
    }
}