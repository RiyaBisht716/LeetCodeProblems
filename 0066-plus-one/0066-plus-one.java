class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Traverse from last digit
        for (int i = n - 1; i >= 0; i--) {
            // If current digit is less than 9, just add 1 and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // Otherwise set current digit to 0 and continue carry
            digits[i] = 0;
        }

        // If all digits were 9, we need a new array
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;  // e.g., 999 → 1000
        return newNumber;
    }
        
    }
