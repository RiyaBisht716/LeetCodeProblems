class Solution {
    public int countPrimes(int n) {
if (n <= 2) return 0; // no primes less than 2

        // Only track odd numbers: index i represents number (2 * i + 1)
        int size = n / 2;
        boolean[] isPrime = new boolean[size];
        Arrays.fill(isPrime, true);

        // We start from 3, which corresponds to index 1 (since 2*1 + 1 = 3)
        int limit = (int) Math.sqrt(n);
        for (int i = 1; (2 * i + 1) <= limit; i++) {
            if (isPrime[i]) {
                int p = 2 * i + 1; // actual prime number

                // Start crossing from p*p, but we need its index:
                // p*p = (2*i+1)^2, index = (p*p - 1) / 2
                int start = (p * p - 1) / 2;

                for (int j = start; j < size; j += p) {
                    isPrime[j] = false;
                }
            }
        }

        // Count primes: 2 is prime, plus all remaining odds
        int count = 1; // for prime number 2
        for (int i = 1; i < size; i++) {
            if (isPrime[i]) count++;
        }

        return count;
    }
}