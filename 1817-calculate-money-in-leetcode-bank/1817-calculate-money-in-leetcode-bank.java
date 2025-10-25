class Solution {
    public int totalMoney(int n) {
        int weeks = n / 7;        // Complete weeks
        int days = n % 7;         // Remaining days
        int total = 0;

        // Sum for complete weeks
        // Each week increases the start deposit by 1
        total += 28 * weeks + 7 * (weeks * (weeks - 1)) / 2;

        // Sum for remaining days in the last incomplete week
        int start = weeks + 1;
        for (int i = 0; i < days; i++) {
            total += start + i;
        }

        return total;
        
    }
}