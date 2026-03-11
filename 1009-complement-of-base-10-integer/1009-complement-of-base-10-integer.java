class Solution {
    public int bitwiseComplement(int n) {
           if (n == 0) return 1;

        int bits = Integer.toBinaryString(n).length();
        int mask = (1 << bits) - 1;

        return mask ^ n;
    }
}