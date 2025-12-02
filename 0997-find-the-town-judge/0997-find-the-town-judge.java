class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] inDeg = new int[n + 1];

    for (int[] t : trust) {
        inDeg[t[1]]++;     // person t[1] is trusted by someone
        inDeg[t[0]] = -1;  // person t[0] trusts someone → cannot be judge
    }

    for (int i = 1; i <= n; i++) {
        if (inDeg[i] == n - 1) {
            return i;  // judge found
        }
    }

    return -1; // no judge
    }
}