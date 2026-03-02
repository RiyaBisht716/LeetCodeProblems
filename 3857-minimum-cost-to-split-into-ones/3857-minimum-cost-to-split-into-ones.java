class Solution {
    public int minCost(int n) {
        long ans = (long) n * (n-1) / 2;
        return (int) ans; 
    }
}